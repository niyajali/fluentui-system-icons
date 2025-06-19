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

public val FluentIcons.Regular.ArrowReset: ImageVector
    get() {
        if (_ArrowReset != null) {
            return _ArrowReset!!
        }
        _ArrowReset = ImageVector.Builder(
            name = "Regular.ArrowReset",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.78f, 2.72f)
                curveTo(7.073f, 3.013f, 7.073f, 3.487f, 6.78f, 3.78f)
                lineTo(4.561f, 6f)
                horizontalLineTo(13.25f)
                curveTo(17.53f, 6f, 21f, 9.47f, 21f, 13.75f)
                curveTo(21f, 18.03f, 17.53f, 21.5f, 13.25f, 21.5f)
                curveTo(8.97f, 21.5f, 5.5f, 18.03f, 5.5f, 13.75f)
                curveTo(5.5f, 13.336f, 5.836f, 13f, 6.25f, 13f)
                curveTo(6.664f, 13f, 7f, 13.336f, 7f, 13.75f)
                curveTo(7f, 17.202f, 9.798f, 20f, 13.25f, 20f)
                curveTo(16.702f, 20f, 19.5f, 17.202f, 19.5f, 13.75f)
                curveTo(19.5f, 10.298f, 16.702f, 7.5f, 13.25f, 7.5f)
                horizontalLineTo(4.561f)
                lineTo(6.78f, 9.72f)
                curveTo(7.073f, 10.013f, 7.073f, 10.487f, 6.78f, 10.78f)
                curveTo(6.487f, 11.073f, 6.013f, 11.073f, 5.72f, 10.78f)
                lineTo(2.22f, 7.28f)
                curveTo(1.927f, 6.987f, 1.927f, 6.513f, 2.22f, 6.22f)
                lineTo(5.72f, 2.72f)
                curveTo(6.013f, 2.427f, 6.487f, 2.427f, 6.78f, 2.72f)
                close()
            }
        }.build()

        return _ArrowReset!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowReset: ImageVector? = null

@Preview
@Composable
private fun ArrowResetPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowReset, contentDescription = null)
    }
}
