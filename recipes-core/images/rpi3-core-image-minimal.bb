require recipes-core/images/core-image-minimal.bb

HARDWARE_PACKAGES = "kernel-modules \
										linux-firmware-rpidistro-bcm43455 \
										"

NETWORK_PACKAGES = "i2c-tools \
										bridge-utils \
										hostapd \
										dhcp-server \
										iptables \
										wpa-supplicant \
										packagegroup-core-ssh-openssh \
										"

PYTHON_PACKAGES = "python3 \
									 python3-pip \
									"

IMAGE_INSTALL_append += " ${HARDWARE_PACKAGES} \
													${NETWORK_PACKAGES} \
													${PYTHON_PACKAGES} \
													"
IMAGE_ROOTFS_EXTRA_SPACE = "1048576"
