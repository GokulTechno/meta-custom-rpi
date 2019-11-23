
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://customconf.cfg"

do_configure_append () {
    ${S}/scripts/kconfig/merge_config.sh -m -O ${WORKDIR}/linux-rpidragon-standard-build ${WORKDIR}/linux-rpidragon-standard-build/.config ${WORKDIR}/customconf.cfg
}

do_deploy_append (){
	sed -i "s/root=\/dev\/mmcblk0p2/console=tty1 console=serial0,115200 root=\/dev\/mmcblk0p2/g" ${DEPLOYDIR}/bcm2835-bootfiles/cmdline.txt
}
