# Meta-amateurradio

This layer is intended to add recipes for SDR packages, digital modes and other
software indended for amateur radio operators.

## Dependencies

This layer depends on:

* URI: git://git.yoctoproject.org/poky
  * layers: meta, meta-poky
  * branch: dunfell / gatesgarth

* URI: git://git.openembedded.org/meta-openembedded
  * layers: meta-oe
  * layers: dunfell / gatesgarth

Optional dependencies:

* URI: git://github.com/meta-qt5/meta-qt5
  * layers: meta-qt5
  * layers: dunfell / gatesgarth

* URI: git://git.openembedded.org/meta-openembedded
  * layers: meta-networking
  * layers: dunfell / gatesgarth

## Issues & contributions

Please send your issues, patches and pull requests on the github repository, at
<https://github.com/adrians/meta-amateurradio>.

## Hints

* Some digital modes (WSPR, FT8, etc.) require a synchronized system clock. If
the board. You might want to install `ntpdate` on the board (from
meta-networking layer).

* Some packages (WSJT-X, JS8Call) depend on fortran libraries, but the fortran
runtime is not enabled by default in the yocto project. You'll need to add the
following lone to the `conf/local.conf` file:
```
FORTRAN_forcevariable = ",fortran"
```

* If using rtl-based sdr dongles, you might need to unload the `dvb_usb_rtl28xxu`
module from the kernel, as it is automatically inserted.
```bash
rmmod dvb_usb_rtl28xxu
```

* When starting direwolf, you need a configuration file in `~/direwolf.conf`
specifying the audio interface. Use `cm108` tool to identify the audio interface
and then create the file:
```bash
echo "ADEVICE plughw:0,0" > direwolf.conf
```