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

public val FluentIcons.Filled.ArrowUpExclamation: ImageVector
    get() {
        if (_ArrowUpExclamation != null) {
            return _ArrowUpExclamation!!
        }
        _ArrowUpExclamation = ImageVector.Builder(
            name = "Filled.ArrowUpExclamation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 4.561f)
                verticalLineTo(21.25f)
                curveTo(18f, 21.664f, 17.664f, 22f, 17.25f, 22f)
                curveTo(16.836f, 22f, 16.5f, 21.664f, 16.5f, 21.25f)
                verticalLineTo(4.561f)
                lineTo(14.28f, 6.78f)
                curveTo(13.987f, 7.073f, 13.513f, 7.073f, 13.22f, 6.78f)
                curveTo(12.927f, 6.487f, 12.927f, 6.013f, 13.22f, 5.72f)
                lineTo(16.72f, 2.22f)
                curveTo(17.013f, 1.927f, 17.487f, 1.927f, 17.78f, 2.22f)
                lineTo(21.28f, 5.72f)
                curveTo(21.573f, 6.013f, 21.573f, 6.487f, 21.28f, 6.78f)
                curveTo(20.987f, 7.073f, 20.513f, 7.073f, 20.22f, 6.78f)
                lineTo(18f, 4.561f)
                close()
                moveTo(3.125f, 5.877f)
                curveTo(3.125f, 3.737f, 4.86f, 2.002f, 7f, 2.002f)
                curveTo(9.141f, 2.002f, 10.876f, 3.737f, 10.876f, 5.877f)
                curveTo(10.876f, 8.827f, 9.671f, 12.441f, 9.065f, 14.081f)
                curveTo(8.741f, 14.957f, 7.906f, 15.5f, 7.003f, 15.5f)
                curveTo(6.097f, 15.5f, 5.261f, 14.954f, 4.938f, 14.076f)
                curveTo(4.332f, 12.429f, 3.125f, 8.796f, 3.125f, 5.877f)
                close()
                moveTo(4.5f, 19.502f)
                curveTo(4.5f, 18.121f, 5.62f, 17.001f, 7.001f, 17.001f)
                curveTo(8.382f, 17.001f, 9.502f, 18.121f, 9.502f, 19.502f)
                curveTo(9.502f, 20.883f, 8.382f, 22.003f, 7.001f, 22.003f)
                curveTo(5.62f, 22.003f, 4.5f, 20.883f, 4.5f, 19.502f)
                close()
            }
        }.build()

        return _ArrowUpExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _ArrowUpExclamation: ImageVector? = null

@Preview
@Composable
private fun ArrowUpExclamationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ArrowUpExclamation, contentDescription = null)
    }
}
