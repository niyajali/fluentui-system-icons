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

public val FluentIcons.Regular.ArrowNext: ImageVector
    get() {
        if (_ArrowNext != null) {
            return _ArrowNext!!
        }
        _ArrowNext = ImageVector.Builder(
            name = "Regular.ArrowNext",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18.25f, 3f)
                curveTo(18.63f, 3f, 18.944f, 3.282f, 18.993f, 3.648f)
                lineTo(19f, 3.75f)
                verticalLineTo(20.25f)
                curveTo(19f, 20.664f, 18.664f, 21f, 18.25f, 21f)
                curveTo(17.87f, 21f, 17.556f, 20.718f, 17.507f, 20.352f)
                lineTo(17.5f, 20.25f)
                verticalLineTo(3.75f)
                curveTo(17.5f, 3.336f, 17.836f, 3f, 18.25f, 3f)
                close()
                moveTo(5.22f, 3.22f)
                curveTo(5.486f, 2.953f, 5.903f, 2.929f, 6.196f, 3.147f)
                lineTo(6.28f, 3.22f)
                lineTo(14.53f, 11.47f)
                curveTo(14.797f, 11.736f, 14.821f, 12.153f, 14.603f, 12.446f)
                lineTo(14.53f, 12.53f)
                lineTo(6.28f, 20.78f)
                curveTo(5.987f, 21.073f, 5.513f, 21.073f, 5.22f, 20.78f)
                curveTo(4.953f, 20.514f, 4.929f, 20.097f, 5.147f, 19.804f)
                lineTo(5.22f, 19.72f)
                lineTo(12.939f, 12f)
                lineTo(5.22f, 4.28f)
                curveTo(4.927f, 3.987f, 4.927f, 3.513f, 5.22f, 3.22f)
                close()
            }
        }.build()

        return _ArrowNext!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowNext: ImageVector? = null

@Preview
@Composable
private fun ArrowNextPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowNext, contentDescription = null)
    }
}
