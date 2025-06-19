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

public val FluentIcons.Regular.BeakerDismiss: ImageVector
    get() {
        if (_BeakerDismiss != null) {
            return _BeakerDismiss!!
        }
        _BeakerDismiss = ImageVector.Builder(
            name = "Regular.BeakerDismiss",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8f, 4.5f)
                horizontalLineTo(8.999f)
                verticalLineTo(10.738f)
                curveTo(8.999f, 11.113f, 8.906f, 11.482f, 8.727f, 11.812f)
                lineTo(5.142f, 18.415f)
                curveTo(4.509f, 19.581f, 5.353f, 21f, 6.68f, 21f)
                horizontalLineTo(12.021f)
                curveTo(11.725f, 20.537f, 11.485f, 20.033f, 11.313f, 19.5f)
                horizontalLineTo(6.68f)
                curveTo(6.491f, 19.5f, 6.37f, 19.297f, 6.46f, 19.131f)
                lineTo(8.431f, 15.5f)
                horizontalLineTo(11.313f)
                curveTo(11.485f, 14.967f, 11.725f, 14.463f, 12.021f, 14f)
                horizontalLineTo(9.246f)
                lineTo(10.045f, 12.527f)
                curveTo(10.343f, 11.978f, 10.5f, 11.363f, 10.5f, 10.738f)
                verticalLineTo(4.5f)
                horizontalLineTo(13.5f)
                verticalLineTo(10.738f)
                curveTo(13.5f, 11.23f, 13.596f, 11.715f, 13.782f, 12.167f)
                curveTo(14.194f, 11.879f, 14.641f, 11.638f, 15.115f, 11.451f)
                curveTo(15.039f, 11.222f, 15f, 10.981f, 15f, 10.738f)
                verticalLineTo(4.5f)
                horizontalLineTo(16f)
                curveTo(16.414f, 4.5f, 16.75f, 4.164f, 16.75f, 3.75f)
                curveTo(16.75f, 3.336f, 16.414f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                curveTo(7.585f, 3f, 7.25f, 3.336f, 7.25f, 3.75f)
                curveTo(7.25f, 4.164f, 7.585f, 4.5f, 8f, 4.5f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 14.462f, 20.537f, 12f, 17.5f, 12f)
                curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
                curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
                curveTo(20.537f, 23f, 23f, 20.538f, 23f, 17.5f)
                close()
                moveTo(15.023f, 15.024f)
                lineTo(15.093f, 14.966f)
                lineTo(15.169f, 14.923f)
                curveTo(15.327f, 14.851f, 15.515f, 14.865f, 15.661f, 14.966f)
                lineTo(15.73f, 15.024f)
                lineTo(17.5f, 16.794f)
                lineTo(19.272f, 15.024f)
                lineTo(19.341f, 14.966f)
                curveTo(19.511f, 14.848f, 19.739f, 14.848f, 19.91f, 14.966f)
                lineTo(19.979f, 15.024f)
                lineTo(20.037f, 15.093f)
                curveTo(20.155f, 15.264f, 20.155f, 15.491f, 20.037f, 15.662f)
                lineTo(19.979f, 15.731f)
                lineTo(18.207f, 17.501f)
                lineTo(19.976f, 19.27f)
                lineTo(20.034f, 19.339f)
                curveTo(20.152f, 19.51f, 20.152f, 19.737f, 20.034f, 19.908f)
                lineTo(19.976f, 19.977f)
                lineTo(19.907f, 20.035f)
                curveTo(19.736f, 20.153f, 19.509f, 20.153f, 19.338f, 20.035f)
                lineTo(19.269f, 19.977f)
                lineTo(17.5f, 18.208f)
                lineTo(15.733f, 19.975f)
                lineTo(15.664f, 20.032f)
                curveTo(15.493f, 20.151f, 15.266f, 20.151f, 15.095f, 20.032f)
                lineTo(15.026f, 19.975f)
                lineTo(14.968f, 19.905f)
                curveTo(14.85f, 19.735f, 14.85f, 19.507f, 14.968f, 19.337f)
                lineTo(15.026f, 19.267f)
                lineTo(16.793f, 17.501f)
                lineTo(15.023f, 15.731f)
                lineTo(14.965f, 15.662f)
                curveTo(14.847f, 15.491f, 14.847f, 15.264f, 14.965f, 15.093f)
                lineTo(15.023f, 15.024f)
                close()
            }
        }.build()

        return _BeakerDismiss!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerDismiss: ImageVector? = null

@Preview
@Composable
private fun BeakerDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BeakerDismiss, contentDescription = null)
    }
}
