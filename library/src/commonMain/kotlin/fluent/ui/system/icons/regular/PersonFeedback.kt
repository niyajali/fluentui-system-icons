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

public val FluentIcons.Regular.PersonFeedback: ImageVector
    get() {
        if (_PersonFeedback != null) {
            return _PersonFeedback!!
        }
        _PersonFeedback = ImageVector.Builder(
            name = "Regular.PersonFeedback",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(14.77f, 12.4f)
                curveTo(14.92f, 12.47f, 15.09f, 12.5f, 15.25f, 12.5f)
                curveTo(15.58f, 12.5f, 15.89f, 12.37f, 16.13f, 12.14f)
                lineTo(18.31f, 10f)
                horizontalLineTo(19.25f)
                curveTo(20.77f, 10f, 22f, 8.77f, 22f, 7.25f)
                verticalLineTo(4.75f)
                curveTo(22f, 3.23f, 20.77f, 2f, 19.25f, 2f)
                horizontalLineTo(14.75f)
                curveTo(13.23f, 2f, 12f, 3.23f, 12f, 4.75f)
                verticalLineTo(7.25f)
                curveTo(12f, 8.51f, 12.85f, 9.57f, 14f, 9.9f)
                verticalLineTo(11.25f)
                curveTo(14f, 11.75f, 14.31f, 12.2f, 14.77f, 12.4f)
                close()
                moveTo(13.5f, 4.75f)
                curveTo(13.5f, 4.06f, 14.06f, 3.5f, 14.75f, 3.5f)
                horizontalLineTo(19.25f)
                curveTo(19.94f, 3.5f, 20.5f, 4.06f, 20.5f, 4.75f)
                verticalLineTo(7.25f)
                curveTo(20.5f, 7.94f, 19.94f, 8.5f, 19.25f, 8.5f)
                horizontalLineTo(17.69f)
                lineTo(15.5f, 10.65f)
                verticalLineTo(8.5f)
                horizontalLineTo(14.75f)
                curveTo(14.06f, 8.5f, 13.5f, 7.94f, 13.5f, 7.25f)
                verticalLineTo(4.75f)
                close()
                moveTo(8f, 13.5f)
                curveTo(6.07f, 13.5f, 4.5f, 11.93f, 4.5f, 10f)
                curveTo(4.5f, 8.07f, 6.07f, 6.5f, 8f, 6.5f)
                curveTo(9.93f, 6.5f, 11.5f, 8.07f, 11.5f, 10f)
                curveTo(11.5f, 11.93f, 9.93f, 13.5f, 8f, 13.5f)
                close()
                moveTo(8f, 8f)
                curveTo(6.9f, 8f, 6f, 8.9f, 6f, 10f)
                curveTo(6f, 11.1f, 6.9f, 12f, 8f, 12f)
                curveTo(9.1f, 12f, 10f, 11.1f, 10f, 10f)
                curveTo(10f, 8.9f, 9.1f, 8f, 8f, 8f)
                close()
                moveTo(8.001f, 22f)
                curveTo(5.941f, 22f, 4.361f, 21.44f, 3.301f, 20.33f)
                curveTo(1.964f, 18.926f, 1.997f, 17.156f, 2.001f, 16.973f)
                lineTo(2.001f, 16.96f)
                curveTo(2.001f, 15.89f, 2.901f, 15f, 4.001f, 15f)
                horizontalLineTo(12.001f)
                curveTo(13.101f, 15f, 14.001f, 15.9f, 14.001f, 17f)
                lineTo(14.001f, 17.006f)
                curveTo(14.004f, 17.132f, 14.046f, 18.917f, 12.701f, 20.33f)
                curveTo(11.641f, 21.44f, 10.061f, 22f, 8.001f, 22f)
                close()
                moveTo(4.001f, 16.5f)
                curveTo(3.721f, 16.5f, 3.501f, 16.72f, 3.501f, 17f)
                lineTo(3.501f, 17.005f)
                curveTo(3.5f, 17.1f, 3.483f, 18.353f, 4.401f, 19.31f)
                curveTo(5.161f, 20.1f, 6.371f, 20.5f, 8.001f, 20.5f)
                curveTo(9.631f, 20.5f, 10.851f, 20.09f, 11.611f, 19.29f)
                curveTo(12.523f, 18.338f, 12.502f, 17.097f, 12.501f, 17.032f)
                lineTo(12.501f, 17.03f)
                curveTo(12.501f, 16.72f, 12.271f, 16.49f, 12.001f, 16.49f)
                horizontalLineTo(4.001f)
                verticalLineTo(16.5f)
                close()
            }
        }.build()

        return _PersonFeedback!!
    }

@Suppress("ObjectPropertyName")
private var _PersonFeedback: ImageVector? = null

@Preview
@Composable
private fun PersonFeedbackPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.PersonFeedback, contentDescription = null)
    }
}
