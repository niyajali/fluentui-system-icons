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

public val FluentUi.Regular.ArrowRepeatAll: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ArrowRepeatAll",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(14.61f, 2.47f)
            lineTo(14.533f, 2.403f)
            curveTo(14.239f, 2.179f, 13.818f, 2.201f, 13.55f, 2.47f)
            lineTo(13.482f, 2.548f)
            curveTo(13.259f, 2.843f, 13.281f, 3.266f, 13.55f, 3.535f)
            lineTo(15.521f, 5.512f)
            horizontalLineTo(8.5f)
            lineTo(8.267f, 5.516f)
            curveTo(4.785f, 5.639f, 2f, 8.511f, 2f, 12.035f)
            curveTo(2f, 13.726f, 2.641f, 15.266f, 3.692f, 16.425f)
            lineTo(3.764f, 16.495f)
            curveTo(3.895f, 16.607f, 4.065f, 16.674f, 4.25f, 16.674f)
            curveTo(4.664f, 16.674f, 5f, 16.337f, 5f, 15.921f)
            curveTo(5f, 15.748f, 4.942f, 15.589f, 4.844f, 15.461f)
            lineTo(4.644f, 15.231f)
            curveTo(3.93f, 14.363f, 3.5f, 13.249f, 3.5f, 12.035f)
            curveTo(3.5f, 9.264f, 5.739f, 7.017f, 8.5f, 7.017f)
            horizontalLineTo(15.381f)
            lineTo(13.55f, 8.858f)
            lineTo(13.482f, 8.935f)
            curveTo(13.259f, 9.23f, 13.281f, 9.653f, 13.55f, 9.922f)
            curveTo(13.842f, 10.216f, 14.317f, 10.216f, 14.61f, 9.922f)
            lineTo(17.792f, 6.729f)
            lineTo(17.859f, 6.651f)
            curveTo(18.083f, 6.356f, 18.061f, 5.933f, 17.792f, 5.664f)
            lineTo(14.61f, 2.47f)
            close()
            moveTo(20.23f, 7.571f)
            curveTo(20.1f, 7.462f, 19.933f, 7.397f, 19.75f, 7.397f)
            curveTo(19.336f, 7.397f, 19f, 7.734f, 19f, 8.149f)
            curveTo(19f, 8.336f, 19.068f, 8.507f, 19.179f, 8.637f)
            curveTo(19.999f, 9.531f, 20.5f, 10.725f, 20.5f, 12.035f)
            curveTo(20.5f, 14.807f, 18.261f, 17.054f, 15.5f, 17.054f)
            horizontalLineTo(8.558f)
            lineTo(10.463f, 15.142f)
            lineTo(10.536f, 15.057f)
            curveTo(10.734f, 14.79f, 10.732f, 14.421f, 10.531f, 14.155f)
            lineTo(10.463f, 14.078f)
            lineTo(10.378f, 14.005f)
            curveTo(10.112f, 13.807f, 9.744f, 13.809f, 9.48f, 14.011f)
            lineTo(9.403f, 14.078f)
            lineTo(6.221f, 17.271f)
            lineTo(6.148f, 17.357f)
            curveTo(5.95f, 17.624f, 5.952f, 17.993f, 6.154f, 18.259f)
            lineTo(6.221f, 18.336f)
            lineTo(9.403f, 21.529f)
            lineTo(9.487f, 21.602f)
            curveTo(9.78f, 21.821f, 10.197f, 21.797f, 10.463f, 21.529f)
            curveTo(10.732f, 21.26f, 10.754f, 20.837f, 10.531f, 20.542f)
            lineTo(10.463f, 20.465f)
            lineTo(8.564f, 18.559f)
            horizontalLineTo(15.5f)
            lineTo(15.733f, 18.555f)
            curveTo(19.215f, 18.432f, 22f, 15.56f, 22f, 12.035f)
            curveTo(22f, 10.342f, 21.357f, 8.799f, 20.303f, 7.64f)
            lineTo(20.23f, 7.571f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowRepeatAllPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.ArrowRepeatAll, contentDescription = null)
    }
}
