do_install_append() {
	echo "network={
	        ssid=\"Syed\"
					psk=\"Pasha@123\"
	}" >> ${sysconfdir}/wpa_supplicant.conf
}
