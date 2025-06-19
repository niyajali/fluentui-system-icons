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

public val FluentIcons.Filled.HatGraduation: ImageVector
    get() {
        if (_HatGraduation != null) {
            return _HatGraduation!!
        }
        _HatGraduation = ImageVector.Builder(
            name = "Filled.HatGraduation",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5f, 17.749f)
                verticalLineTo(13.983f)
                lineTo(9.06f, 16.636f)
                curveTo(10.846f, 17.803f, 13.154f, 17.803f, 14.94f, 16.636f)
                lineTo(19f, 13.983f)
                verticalLineTo(17.749f)
                curveTo(19f, 17.911f, 18.947f, 18.069f, 18.85f, 18.199f)
                lineTo(18.849f, 18.201f)
                lineTo(18.848f, 18.202f)
                lineTo(18.845f, 18.206f)
                lineTo(18.836f, 18.217f)
                lineTo(18.824f, 18.232f)
                lineTo(18.811f, 18.249f)
                curveTo(18.79f, 18.274f, 18.762f, 18.309f, 18.725f, 18.35f)
                curveTo(18.652f, 18.434f, 18.547f, 18.547f, 18.408f, 18.681f)
                curveTo(18.131f, 18.947f, 17.718f, 19.294f, 17.159f, 19.638f)
                curveTo(16.036f, 20.329f, 14.339f, 20.999f, 12f, 20.999f)
                curveTo(9.661f, 20.999f, 7.964f, 20.329f, 6.841f, 19.638f)
                curveTo(6.282f, 19.294f, 5.87f, 18.947f, 5.592f, 18.681f)
                curveTo(5.453f, 18.547f, 5.348f, 18.434f, 5.275f, 18.35f)
                curveTo(5.238f, 18.309f, 5.21f, 18.274f, 5.189f, 18.249f)
                curveTo(5.179f, 18.236f, 5.17f, 18.225f, 5.164f, 18.217f)
                lineTo(5.155f, 18.206f)
                lineTo(5.152f, 18.202f)
                lineTo(5.151f, 18.201f)
                curveTo(5.054f, 18.071f, 5f, 17.911f, 5f, 17.749f)
                close()
                moveTo(22.16f, 10.127f)
                lineTo(14.119f, 15.38f)
                curveTo(12.832f, 16.222f, 11.168f, 16.222f, 9.881f, 15.38f)
                lineTo(3f, 10.885f)
                lineTo(3f, 16.249f)
                curveTo(3f, 16.663f, 2.664f, 16.999f, 2.25f, 16.999f)
                curveTo(1.836f, 16.999f, 1.5f, 16.663f, 1.5f, 16.249f)
                verticalLineTo(9.999f)
                curveTo(1.5f, 9.911f, 1.515f, 9.827f, 1.543f, 9.749f)
                curveTo(1.514f, 9.669f, 1.5f, 9.583f, 1.5f, 9.496f)
                curveTo(1.501f, 9.241f, 1.631f, 9.005f, 1.845f, 8.868f)
                lineTo(9.909f, 3.699f)
                curveTo(11.183f, 2.882f, 12.817f, 2.882f, 14.091f, 3.699f)
                lineTo(22.155f, 8.868f)
                curveTo(22.369f, 9.005f, 22.499f, 9.241f, 22.5f, 9.496f)
                curveTo(22.501f, 9.718f, 22.403f, 9.928f, 22.236f, 10.07f)
                curveTo(22.212f, 10.091f, 22.187f, 10.109f, 22.16f, 10.127f)
                close()
            }
        }.build()

        return _HatGraduation!!
    }

@Suppress("ObjectPropertyName")
private var _HatGraduation: ImageVector? = null

@Preview
@Composable
private fun HatGraduationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.HatGraduation, contentDescription = null)
    }
}
