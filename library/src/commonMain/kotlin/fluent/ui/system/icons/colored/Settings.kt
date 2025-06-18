package fluent.ui.system.icons.colored

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Colored.Settings: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Colored.Settings",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF70777D),
                    1f to Color(0xFFB9C0C7)
                ),
                start = Offset(16.682f, 20.995f),
                end = Offset(5.785f, 3.996f)
            )
        ) {
            moveTo(12.012f, 2.25f)
            curveTo(12.746f, 2.258f, 13.477f, 2.343f, 14.194f, 2.503f)
            curveTo(14.506f, 2.573f, 14.74f, 2.834f, 14.776f, 3.152f)
            lineTo(14.946f, 4.679f)
            curveTo(15.023f, 5.38f, 15.615f, 5.911f, 16.321f, 5.912f)
            curveTo(16.51f, 5.912f, 16.698f, 5.872f, 16.873f, 5.795f)
            lineTo(18.274f, 5.18f)
            curveTo(18.565f, 5.052f, 18.906f, 5.121f, 19.123f, 5.354f)
            curveTo(20.135f, 6.435f, 20.889f, 7.731f, 21.328f, 9.146f)
            curveTo(21.422f, 9.451f, 21.313f, 9.782f, 21.056f, 9.972f)
            lineTo(19.815f, 10.887f)
            curveTo(19.461f, 11.147f, 19.252f, 11.56f, 19.252f, 12f)
            curveTo(19.252f, 12.439f, 19.461f, 12.852f, 19.816f, 13.113f)
            lineTo(21.058f, 14.028f)
            curveTo(21.315f, 14.218f, 21.424f, 14.549f, 21.33f, 14.854f)
            curveTo(20.891f, 16.268f, 20.138f, 17.565f, 19.126f, 18.646f)
            curveTo(18.909f, 18.878f, 18.569f, 18.948f, 18.278f, 18.821f)
            lineTo(16.871f, 18.205f)
            curveTo(16.469f, 18.028f, 16.007f, 18.054f, 15.627f, 18.274f)
            curveTo(15.246f, 18.494f, 14.993f, 18.881f, 14.945f, 19.318f)
            lineTo(14.776f, 20.844f)
            curveTo(14.741f, 21.159f, 14.512f, 21.418f, 14.204f, 21.492f)
            curveTo(12.756f, 21.836f, 11.247f, 21.836f, 9.798f, 21.492f)
            curveTo(9.49f, 21.418f, 9.261f, 21.159f, 9.226f, 20.844f)
            lineTo(9.057f, 19.32f)
            curveTo(9.008f, 18.884f, 8.754f, 18.498f, 8.374f, 18.279f)
            curveTo(7.995f, 18.06f, 7.533f, 18.034f, 7.132f, 18.209f)
            lineTo(5.726f, 18.826f)
            curveTo(5.434f, 18.953f, 5.094f, 18.883f, 4.877f, 18.651f)
            curveTo(3.865f, 17.569f, 3.111f, 16.271f, 2.673f, 14.855f)
            curveTo(2.579f, 14.55f, 2.688f, 14.219f, 2.945f, 14.029f)
            lineTo(4.188f, 13.113f)
            curveTo(4.542f, 12.853f, 4.751f, 12.44f, 4.751f, 12f)
            curveTo(4.751f, 11.561f, 4.542f, 11.148f, 4.188f, 10.887f)
            lineTo(2.945f, 9.973f)
            curveTo(2.688f, 9.783f, 2.579f, 9.452f, 2.673f, 9.147f)
            curveTo(3.112f, 7.732f, 3.866f, 6.436f, 4.878f, 5.355f)
            curveTo(5.096f, 5.122f, 5.436f, 5.053f, 5.727f, 5.181f)
            lineTo(7.128f, 5.796f)
            curveTo(7.531f, 5.973f, 7.994f, 5.946f, 8.376f, 5.723f)
            curveTo(8.756f, 5.502f, 9.009f, 5.114f, 9.058f, 4.678f)
            lineTo(9.228f, 3.152f)
            curveTo(9.264f, 2.833f, 9.498f, 2.573f, 9.811f, 2.503f)
            curveTo(10.528f, 2.343f, 11.26f, 2.259f, 12.012f, 2.25f)
            close()
            moveTo(12f, 9f)
            curveTo(10.343f, 9f, 9f, 10.343f, 9f, 12f)
            curveTo(9f, 13.657f, 10.343f, 15f, 12f, 15f)
            curveTo(13.656f, 15f, 15f, 13.657f, 15f, 12f)
            curveTo(15f, 10.343f, 13.656f, 9f, 12f, 9f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun SettingsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Colored.Settings, contentDescription = null)
    }
}
