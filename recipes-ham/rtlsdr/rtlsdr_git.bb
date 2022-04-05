SUMMARY = "rtlsdr"

DESCRIPTION = "rtl-sdr turns your Realtek RTL2832 based DVB dongle into a SDR \
receiver"

HOMEPAGE = "http://sdr.osmocom.org/trac/wiki/rtl-sdr"

LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${S}/COPYING;md5=751419260aa954499f7abaabaa882bbe"

DEPENDS = "libusb1"
RDEPENDS_${PN} = "libusb1"

SRCREV = "0d825fe08ef1e0225340fa7d8dffa621ad80a818"
SRC_URI = "git://github.com/keenerd/rtl-sdr.git;protocol=https;branch=master \
           file://01_fix_pkgconfig.patch \
          "
S = "${WORKDIR}/git"

inherit autotools pkgconfig
