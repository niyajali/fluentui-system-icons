package fluent.ui.system.icons.filled

import org.jetbrains.compose.ui.tooling.preview.Preview
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi

public val FluentUi.Filled.ChatHistory: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ChatHistory",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(22f, 12f)
            curveTo(22f, 6.477f, 17.523f, 2f, 12f, 2f)
            curveTo(9.275f, 2f, 6.804f, 3.09f, 5f, 4.859f)
            verticalLineTo(3.75f)
            curveTo(5f, 3.336f, 4.664f, 3f, 4.25f, 3f)
            curveTo(3.836f, 3f, 3.5f, 3.336f, 3.5f, 3.75f)
            verticalLineTo(7.25f)
            curveTo(3.5f, 7.664f, 3.836f, 8f, 4.25f, 8f)
            horizontalLineTo(7.75f)
            curveTo(8.164f, 8f, 8.5f, 7.664f, 8.5f, 7.25f)
            curveTo(8.5f, 6.836f, 8.164f, 6.5f, 7.75f, 6.5f)
            horizontalLineTo(5.519f)
            curveTo(7.078f, 4.665f, 9.403f, 3.5f, 12f, 3.5f)
            curveTo(16.694f, 3.5f, 20.5f, 7.306f, 20.5f, 12f)
            curveTo(20.5f, 16.694f, 16.694f, 20.5f, 12f, 20.5f)
            curveTo(10.532f, 20.5f, 9.12f, 20.128f, 7.867f, 19.43f)
            lineTo(7.598f, 19.279f)
            lineTo(3.611f, 20.391f)
            lineTo(4.724f, 16.407f)
            lineTo(4.573f, 16.138f)
            curveTo(3.873f, 14.883f, 3.5f, 13.47f, 3.5f, 12f)
            curveTo(3.5f, 11.325f, 3.579f, 10.668f, 3.727f, 10.038f)
            curveTo(3.806f, 9.737f, 3.792f, 9.15f, 3.191f, 9.018f)
            curveTo(2.578f, 8.884f, 2.32f, 9.373f, 2.256f, 9.737f)
            lineTo(2.257f, 9.737f)
            curveTo(2.089f, 10.464f, 2f, 11.222f, 2f, 12f)
            curveTo(2f, 13.62f, 2.386f, 15.186f, 3.115f, 16.592f)
            lineTo(2.047f, 20.415f)
            curveTo(1.985f, 20.635f, 1.985f, 20.868f, 2.047f, 21.088f)
            curveTo(2.233f, 21.753f, 2.922f, 22.141f, 3.587f, 21.955f)
            lineTo(7.413f, 20.888f)
            curveTo(8.818f, 21.615f, 10.382f, 22f, 12f, 22f)
            curveTo(17.523f, 22f, 22f, 17.523f, 22f, 12f)
            close()
            moveTo(8.169f, 5.551f)
            curveTo(9.291f, 4.883f, 10.6f, 4.5f, 12f, 4.5f)
            curveTo(16.142f, 4.5f, 19.5f, 7.858f, 19.5f, 12f)
            curveTo(19.5f, 16.142f, 16.142f, 19.5f, 12f, 19.5f)
            curveTo(10.703f, 19.5f, 9.458f, 19.172f, 8.354f, 18.556f)
            lineTo(7.725f, 18.205f)
            lineTo(5.051f, 18.951f)
            lineTo(5.798f, 16.279f)
            lineTo(5.446f, 15.65f)
            curveTo(4.829f, 14.545f, 4.5f, 13.299f, 4.5f, 12f)
            curveTo(4.5f, 11.406f, 4.569f, 10.829f, 4.699f, 10.277f)
            curveTo(4.77f, 9.995f, 4.807f, 9.57f, 4.66f, 9.141f)
            curveTo(4.644f, 9.093f, 4.625f, 9.046f, 4.605f, 9f)
            horizontalLineTo(7.75f)
            curveTo(8.717f, 9f, 9.5f, 8.217f, 9.5f, 7.25f)
            curveTo(9.5f, 6.428f, 8.933f, 5.738f, 8.169f, 5.551f)
            close()
            moveTo(11.25f, 8f)
            curveTo(10.836f, 8f, 10.5f, 8.336f, 10.5f, 8.75f)
            verticalLineTo(13.25f)
            curveTo(10.5f, 13.664f, 10.836f, 14f, 11.25f, 14f)
            horizontalLineTo(14.25f)
            curveTo(14.664f, 14f, 15f, 13.664f, 15f, 13.25f)
            curveTo(15f, 12.836f, 14.664f, 12.5f, 14.25f, 12.5f)
            horizontalLineTo(12f)
            verticalLineTo(8.75f)
            curveTo(12f, 8.336f, 11.664f, 8f, 11.25f, 8f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ChatHistoryPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ChatHistory, contentDescription = null)
    }
}
