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

public val FluentIcons.Regular.ArrowClockwise: ImageVector
    get() {
        if (_ArrowClockwise != null) {
            return _ArrowClockwise!!
        }
        _ArrowClockwise = ImageVector.Builder(
            name = "Regular.ArrowClockwise",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 4.5f)
                curveTo(7.858f, 4.5f, 4.5f, 7.858f, 4.5f, 12f)
                curveTo(4.5f, 16.142f, 7.858f, 19.5f, 12f, 19.5f)
                curveTo(16.142f, 19.5f, 19.5f, 16.142f, 19.5f, 12f)
                curveTo(19.5f, 11.624f, 19.472f, 11.254f, 19.419f, 10.892f)
                curveTo(19.351f, 10.438f, 19.684f, 10f, 20.143f, 10f)
                curveTo(20.514f, 10f, 20.839f, 10.256f, 20.895f, 10.623f)
                curveTo(20.964f, 11.072f, 21f, 11.532f, 21f, 12f)
                curveTo(21f, 16.971f, 16.971f, 21f, 12f, 21f)
                curveTo(7.029f, 21f, 3f, 16.971f, 3f, 12f)
                curveTo(3f, 7.029f, 7.029f, 3f, 12f, 3f)
                curveTo(14.305f, 3f, 16.408f, 3.867f, 18f, 5.292f)
                verticalLineTo(4.25f)
                curveTo(18f, 3.836f, 18.336f, 3.5f, 18.75f, 3.5f)
                curveTo(19.164f, 3.5f, 19.5f, 3.836f, 19.5f, 4.25f)
                verticalLineTo(7.25f)
                curveTo(19.5f, 7.664f, 19.164f, 8f, 18.75f, 8f)
                horizontalLineTo(15.75f)
                curveTo(15.336f, 8f, 15f, 7.664f, 15f, 7.25f)
                curveTo(15f, 6.836f, 15.336f, 6.5f, 15.75f, 6.5f)
                horizontalLineTo(17.099f)
                curveTo(15.761f, 5.259f, 13.969f, 4.5f, 12f, 4.5f)
                close()
            }
        }.build()

        return _ArrowClockwise!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowClockwise: ImageVector? = null

@Preview
@Composable
private fun ArrowClockwisePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.ArrowClockwise, contentDescription = null)
    }
}
