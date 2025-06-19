package fluent.ui.system.icons.filled

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.SportSoccer: ImageVector
    get() {
        if (_SportSoccer != null) {
            return _SportSoccer!!
        }
        _SportSoccer = ImageVector.Builder(
            name = "Filled.SportSoccer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 2f)
                curveTo(6.477f, 2f, 2f, 6.477f, 2f, 12f)
                curveTo(2f, 17.523f, 6.477f, 22f, 12f, 22f)
                curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
                curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
                close()
                moveTo(8.244f, 4.373f)
                lineTo(11.252f, 6.172f)
                verticalLineTo(8.366f)
                lineTo(8.461f, 10.394f)
                lineTo(6.417f, 9.687f)
                lineTo(5.83f, 6.153f)
                curveTo(6.52f, 5.426f, 7.336f, 4.821f, 8.244f, 4.373f)
                close()
                moveTo(3.621f, 13.439f)
                lineTo(5.948f, 11.112f)
                lineTo(7.987f, 11.817f)
                lineTo(9.07f, 15.15f)
                lineTo(8.101f, 16.725f)
                lineTo(4.807f, 16.531f)
                curveTo(4.223f, 15.606f, 3.813f, 14.56f, 3.621f, 13.439f)
                close()
                moveTo(10.53f, 20.373f)
                lineTo(9.346f, 17.564f)
                lineTo(10.309f, 15.997f)
                horizontalLineTo(13.681f)
                lineTo(14.593f, 17.578f)
                lineTo(13.553f, 20.358f)
                curveTo(13.05f, 20.451f, 12.53f, 20.5f, 12f, 20.5f)
                curveTo(11.499f, 20.5f, 11.007f, 20.457f, 10.53f, 20.373f)
                close()
                moveTo(18.892f, 16.976f)
                lineTo(15.868f, 16.787f)
                lineTo(14.93f, 15.162f)
                lineTo(16.017f, 11.817f)
                lineTo(18.03f, 11.121f)
                lineTo(20.342f, 13.642f)
                curveTo(20.102f, 14.868f, 19.598f, 16f, 18.892f, 16.976f)
                close()
                moveTo(18.172f, 6.156f)
                lineTo(17.583f, 9.689f)
                lineTo(15.543f, 10.394f)
                lineTo(12.752f, 8.366f)
                verticalLineTo(6.172f)
                lineTo(15.754f, 4.372f)
                curveTo(16.664f, 4.82f, 17.482f, 5.427f, 18.172f, 6.156f)
                close()
            }
        }.build()

        return _SportSoccer!!
    }

@Suppress("ObjectPropertyName")
private var _SportSoccer: ImageVector? = null

@Preview
@Composable
private fun SportSoccerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.SportSoccer, contentDescription = null)
    }
}
