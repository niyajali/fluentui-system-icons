package fluent.ui.system.icons.light

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

public val FluentUi.Light.StarArrowRight: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.StarArrowRight",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(20.402f, 11.35f)
            curveTo(20.076f, 11.303f, 19.794f, 11.097f, 19.649f, 10.801f)
            lineTo(16.45f, 4.28f)
            curveTo(16.267f, 3.907f, 15.735f, 3.907f, 15.552f, 4.28f)
            lineTo(12.354f, 10.801f)
            curveTo(12.209f, 11.097f, 11.927f, 11.303f, 11.601f, 11.35f)
            lineTo(4.429f, 12.399f)
            curveTo(4.02f, 12.459f, 3.856f, 12.961f, 4.152f, 13.251f)
            lineTo(5.407f, 14.482f)
            curveTo(5.099f, 14.64f, 4.8f, 14.815f, 4.514f, 15.007f)
            lineTo(3.451f, 13.965f)
            curveTo(2.566f, 13.096f, 3.057f, 11.589f, 4.285f, 11.41f)
            lineTo(11.456f, 10.361f)
            lineTo(14.655f, 3.839f)
            curveTo(15.203f, 2.72f, 16.799f, 2.72f, 17.348f, 3.839f)
            lineTo(20.546f, 10.361f)
            lineTo(27.718f, 11.41f)
            curveTo(28.945f, 11.589f, 29.437f, 13.096f, 28.551f, 13.965f)
            lineTo(23.356f, 19.061f)
            lineTo(24.58f, 26.244f)
            curveTo(24.789f, 27.471f, 23.5f, 28.404f, 22.4f, 27.822f)
            lineTo(17.991f, 25.49f)
            curveTo(18.104f, 25.171f, 18.199f, 24.843f, 18.275f, 24.509f)
            lineTo(22.868f, 26.938f)
            curveTo(23.234f, 27.132f, 23.664f, 26.821f, 23.594f, 26.412f)
            lineTo(22.37f, 19.229f)
            curveTo(22.315f, 18.906f, 22.421f, 18.576f, 22.655f, 18.347f)
            lineTo(27.851f, 13.251f)
            curveTo(28.146f, 12.961f, 27.982f, 12.459f, 27.573f, 12.399f)
            lineTo(20.402f, 11.35f)
            close()
            moveTo(17f, 22.5f)
            curveTo(17f, 18.358f, 13.642f, 15f, 9.5f, 15f)
            curveTo(5.358f, 15f, 2f, 18.358f, 2f, 22.5f)
            curveTo(2f, 26.642f, 5.358f, 30f, 9.5f, 30f)
            curveTo(13.642f, 30f, 17f, 26.642f, 17f, 22.5f)
            close()
            moveTo(4.75f, 21.5f)
            horizontalLineTo(12.439f)
            lineTo(9.72f, 18.78f)
            curveTo(9.427f, 18.487f, 9.427f, 18.013f, 9.72f, 17.72f)
            curveTo(10.013f, 17.427f, 10.487f, 17.427f, 10.78f, 17.72f)
            lineTo(14.78f, 21.72f)
            curveTo(15.073f, 22.013f, 15.073f, 22.487f, 14.78f, 22.78f)
            lineTo(10.78f, 26.78f)
            curveTo(10.487f, 27.073f, 10.013f, 27.073f, 9.72f, 26.78f)
            curveTo(9.427f, 26.487f, 9.427f, 26.013f, 9.72f, 25.72f)
            lineTo(12.439f, 23f)
            horizontalLineTo(4.75f)
            curveTo(4.336f, 23f, 4f, 22.664f, 4f, 22.25f)
            curveTo(4f, 21.836f, 4.336f, 21.5f, 4.75f, 21.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun StarArrowRightPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.StarArrowRight, contentDescription = null)
    }
}
