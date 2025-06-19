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

public val FluentIcons.Filled.Kiosk: ImageVector
    get() {
        if (_Kiosk != null) {
            return _Kiosk!!
        }
        _Kiosk = ImageVector.Builder(
            name = "Filled.Kiosk",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.25f, 2f)
                curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
                verticalLineTo(10.75f)
                curveTo(4f, 11.993f, 5.007f, 13f, 6.25f, 13f)
                horizontalLineTo(9.5f)
                verticalLineTo(20.5f)
                horizontalLineTo(7.75f)
                curveTo(7.336f, 20.5f, 7f, 20.836f, 7f, 21.25f)
                curveTo(7f, 21.664f, 7.336f, 22f, 7.75f, 22f)
                horizontalLineTo(16.25f)
                curveTo(16.664f, 22f, 17f, 21.664f, 17f, 21.25f)
                curveTo(17f, 20.836f, 16.664f, 20.5f, 16.25f, 20.5f)
                horizontalLineTo(14.5f)
                verticalLineTo(13f)
                horizontalLineTo(17.75f)
                curveTo(18.993f, 13f, 20f, 11.993f, 20f, 10.75f)
                verticalLineTo(4.25f)
                curveTo(20f, 3.007f, 18.993f, 2f, 17.75f, 2f)
                horizontalLineTo(6.25f)
                close()
                moveTo(11f, 20.5f)
                verticalLineTo(13f)
                horizontalLineTo(13f)
                verticalLineTo(20.5f)
                horizontalLineTo(11f)
                close()
            }
        }.build()

        return _Kiosk!!
    }

@Suppress("ObjectPropertyName")
private var _Kiosk: ImageVector? = null

@Preview
@Composable
private fun KioskPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Kiosk, contentDescription = null)
    }
}
