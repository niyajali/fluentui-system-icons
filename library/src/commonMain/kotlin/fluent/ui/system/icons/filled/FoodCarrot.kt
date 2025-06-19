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

public val FluentIcons.Filled.FoodCarrot: ImageVector
    get() {
        if (_FoodCarrot != null) {
            return _FoodCarrot!!
        }
        _FoodCarrot = ImageVector.Builder(
            name = "Filled.FoodCarrot",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(17.5f, 2.75f)
                curveTo(17.5f, 2.336f, 17.164f, 2f, 16.75f, 2f)
                curveTo(16.336f, 2f, 16f, 2.336f, 16f, 2.75f)
                verticalLineTo(6.765f)
                curveTo(13.974f, 5.407f, 11.133f, 5.884f, 9.707f, 7.98f)
                lineTo(2.353f, 18.786f)
                curveTo(1.797f, 19.604f, 1.904f, 20.697f, 2.608f, 21.394f)
                curveTo(3.323f, 22.101f, 4.447f, 22.198f, 5.275f, 21.625f)
                lineTo(16.064f, 14.155f)
                curveTo(18.121f, 12.731f, 18.576f, 9.978f, 17.241f, 8f)
                horizontalLineTo(21.25f)
                curveTo(21.664f, 8f, 22f, 7.664f, 22f, 7.25f)
                curveTo(22f, 6.836f, 21.664f, 6.5f, 21.25f, 6.5f)
                horizontalLineTo(18.56f)
                lineTo(21.781f, 3.28f)
                curveTo(22.073f, 2.988f, 22.074f, 2.513f, 21.781f, 2.22f)
                curveTo(21.488f, 1.927f, 21.013f, 1.927f, 20.72f, 2.22f)
                lineTo(17.5f, 5.439f)
                verticalLineTo(2.75f)
                close()
            }
        }.build()

        return _FoodCarrot!!
    }

@Suppress("ObjectPropertyName")
private var _FoodCarrot: ImageVector? = null

@Preview
@Composable
private fun FoodCarrotPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.FoodCarrot, contentDescription = null)
    }
}
