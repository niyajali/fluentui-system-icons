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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.HatGraduation: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HatGraduation",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(9.909f, 3.701f)
            curveTo(11.183f, 2.884f, 12.817f, 2.884f, 14.091f, 3.701f)
            lineTo(22.155f, 8.87f)
            curveTo(22.369f, 9.007f, 22.499f, 9.243f, 22.5f, 9.498f)
            curveTo(22.501f, 9.752f, 22.373f, 9.99f, 22.16f, 10.129f)
            lineTo(19f, 12.193f)
            verticalLineTo(17.751f)
            curveTo(19f, 17.913f, 18.947f, 18.071f, 18.85f, 18.201f)
            lineTo(18.849f, 18.202f)
            lineTo(18.848f, 18.204f)
            lineTo(18.845f, 18.208f)
            lineTo(18.836f, 18.219f)
            curveTo(18.832f, 18.224f, 18.827f, 18.231f, 18.821f, 18.238f)
            curveTo(18.818f, 18.242f, 18.815f, 18.246f, 18.811f, 18.25f)
            curveTo(18.79f, 18.276f, 18.762f, 18.31f, 18.725f, 18.352f)
            curveTo(18.652f, 18.436f, 18.547f, 18.549f, 18.408f, 18.683f)
            curveTo(18.131f, 18.949f, 17.718f, 19.296f, 17.159f, 19.64f)
            curveTo(16.036f, 20.331f, 14.339f, 21.001f, 12f, 21.001f)
            curveTo(9.661f, 21.001f, 7.964f, 20.331f, 6.841f, 19.64f)
            curveTo(6.282f, 19.296f, 5.87f, 18.949f, 5.592f, 18.683f)
            curveTo(5.453f, 18.549f, 5.348f, 18.436f, 5.275f, 18.352f)
            curveTo(5.232f, 18.303f, 5.19f, 18.254f, 5.151f, 18.202f)
            curveTo(5.15f, 18.2f, 5.15f, 18.201f, 5.15f, 18.201f)
            curveTo(5.053f, 18.071f, 5f, 17.913f, 5f, 17.751f)
            verticalLineTo(12.193f)
            lineTo(3f, 10.887f)
            verticalLineTo(16.251f)
            curveTo(3f, 16.665f, 2.664f, 17.001f, 2.25f, 17.001f)
            curveTo(1.836f, 17.001f, 1.5f, 16.665f, 1.5f, 16.251f)
            verticalLineTo(9.501f)
            curveTo(1.5f, 9.23f, 1.643f, 8.993f, 1.858f, 8.861f)
            lineTo(9.909f, 3.701f)
            close()
            moveTo(14.119f, 15.382f)
            curveTo(12.832f, 16.223f, 11.168f, 16.223f, 9.881f, 15.382f)
            lineTo(6.5f, 13.174f)
            verticalLineTo(17.47f)
            curveTo(6.537f, 17.508f, 6.58f, 17.552f, 6.631f, 17.601f)
            curveTo(6.841f, 17.803f, 7.171f, 18.081f, 7.627f, 18.362f)
            curveTo(8.536f, 18.921f, 9.964f, 19.501f, 12f, 19.501f)
            curveTo(14.036f, 19.501f, 15.464f, 18.921f, 16.373f, 18.362f)
            curveTo(16.829f, 18.081f, 17.159f, 17.803f, 17.369f, 17.601f)
            curveTo(17.42f, 17.552f, 17.463f, 17.508f, 17.5f, 17.47f)
            verticalLineTo(13.174f)
            lineTo(14.119f, 15.382f)
            close()
            moveTo(13.282f, 4.963f)
            curveTo(12.501f, 4.463f, 11.499f, 4.463f, 10.718f, 4.963f)
            lineTo(3.63f, 9.507f)
            lineTo(10.701f, 14.126f)
            curveTo(11.49f, 14.642f, 12.51f, 14.642f, 13.299f, 14.126f)
            lineTo(20.37f, 9.507f)
            lineTo(13.282f, 4.963f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun HatGraduationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.HatGraduation, contentDescription = null)
    }
}
