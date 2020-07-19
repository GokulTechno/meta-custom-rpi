require recipes-core/images/core-image-minimal.bb

IMAGE_FEATURES += "ssh-server-openssh"

HARDWARE_PACKAGES = "kernel-modules \
										linux-firmware-rpidistro-bcm43455 \
										"

NETWORK_PACKAGES = "connman \
										connman-client \
										connman-tools \
										connman-wait-online \
										packagegroup-core-ssh-openssh \
										openssh-sftp-server \
										"

PYTHON_PACKAGES = "python3 \
									 python3-pip \
									"

IMAGE_INSTALL_append += " ${HARDWARE_PACKAGES} \
													${NETWORK_PACKAGES} \
													${PYTHON_PACKAGES} \
													"

CORE_IMAGE_EXTRA_INSTALL += "wayland weston"
IMAGE_ROOTFS_EXTRA_SPACE = "1048576"
