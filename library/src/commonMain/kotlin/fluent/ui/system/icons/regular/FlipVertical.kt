package fluent.ui.system.icons.regular

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

public val FluentIcons.Regular.FlipVertical: ImageVector
    get() {
        if (_FlipVertical != null) {
            return _FlipVertical!!
        }
        _FlipVertical = ImageVector.Builder(
            name = "Regular.FlipVertical",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.656f, 2.119f)
                curveTo(19.871f, 2.257f, 20f, 2.495f, 20f, 2.75f)
                verticalLineTo(10.25f)
                curveTo(20f, 10.664f, 19.664f, 11f, 19.25f, 11f)
                horizontalLineTo(2.75f)
                curveTo(2.397f, 11f, 2.092f, 10.754f, 2.017f, 10.409f)
                curveTo(1.942f, 10.064f, 2.118f, 9.713f, 2.44f, 9.567f)
                lineTo(18.94f, 2.067f)
                curveTo(19.172f, 1.962f, 19.442f, 1.981f, 19.656f, 2.119f)
                close()
                moveTo(6.213f, 9.5f)
                horizontalLineTo(18.5f)
                verticalLineTo(3.915f)
                lineTo(6.213f, 9.5f)
                close()
                moveTo(20f, 21.5f)
                curveTo(20f, 21.671f, 19.913f, 21.83f, 19.768f, 21.922f)
                curveTo(19.623f, 22.014f, 19.442f, 22.025f, 19.287f, 21.952f)
                lineTo(2.287f, 13.952f)
                curveTo(2.075f, 13.853f, 1.961f, 13.619f, 2.012f, 13.391f)
                curveTo(2.063f, 13.162f, 2.266f, 13f, 2.5f, 13f)
                horizontalLineTo(19.5f)
                curveTo(19.776f, 13f, 20f, 13.224f, 20f, 13.5f)
                verticalLineTo(21.5f)
                close()
            }
        }.build()

        return _FlipVertical!!
    }

@Suppress("ObjectPropertyName")
private var _FlipVertical: ImageVector? = null

@Preview
@Composable
private fun FlipVerticalPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FlipVertical, contentDescription = null)
    }
}
