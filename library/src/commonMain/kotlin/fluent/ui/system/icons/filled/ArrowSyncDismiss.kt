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

public val FluentUi.Filled.ArrowSyncDismiss: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowSyncDismiss",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(16.251f, 5.18f)
            curveTo(15.999f, 5.509f, 16.063f, 5.98f, 16.392f, 6.231f)
            curveTo(18.18f, 7.595f, 19.25f, 9.708f, 19.25f, 12f)
            curveTo(19.25f, 15.736f, 16.424f, 18.812f, 12.793f, 19.207f)
            lineTo(12.804f, 19.197f)
            curveTo(12.54f, 19.226f, 12.272f, 19.241f, 12f, 19.241f)
            curveTo(11.573f, 19.241f, 11.154f, 19.204f, 10.746f, 19.132f)
            lineTo(10.409f, 19.47f)
            curveTo(10.143f, 19.736f, 10.118f, 20.153f, 10.336f, 20.446f)
            lineTo(10.409f, 20.53f)
            lineTo(12.409f, 22.53f)
            curveTo(12.702f, 22.823f, 13.177f, 22.823f, 13.47f, 22.53f)
            curveTo(13.736f, 22.264f, 13.76f, 21.847f, 13.542f, 21.554f)
            lineTo(13.47f, 21.47f)
            lineTo(12.719f, 20.721f)
            curveTo(17.215f, 20.355f, 20.75f, 16.59f, 20.75f, 12f)
            curveTo(20.75f, 9.235f, 19.458f, 6.683f, 17.302f, 5.039f)
            curveTo(16.972f, 4.787f, 16.502f, 4.851f, 16.251f, 5.18f)
            close()
            moveTo(10.53f, 1.47f)
            curveTo(10.237f, 1.763f, 10.237f, 2.237f, 10.53f, 2.53f)
            lineTo(11.28f, 3.279f)
            curveTo(6.784f, 3.646f, 3.25f, 7.41f, 3.25f, 12f)
            curveTo(3.25f, 14.644f, 4.431f, 17.097f, 6.431f, 18.749f)
            curveTo(6.75f, 19.013f, 7.223f, 18.968f, 7.487f, 18.649f)
            curveTo(7.75f, 18.329f, 7.705f, 17.856f, 7.386f, 17.593f)
            curveTo(5.728f, 16.223f, 4.75f, 14.192f, 4.75f, 12f)
            curveTo(4.75f, 8.264f, 7.575f, 5.189f, 11.206f, 4.793f)
            lineTo(11.196f, 4.803f)
            curveTo(11.46f, 4.774f, 11.728f, 4.759f, 12f, 4.759f)
            curveTo(12.428f, 4.759f, 12.847f, 4.796f, 13.254f, 4.867f)
            lineTo(13.591f, 4.53f)
            curveTo(13.884f, 4.237f, 13.884f, 3.763f, 13.591f, 3.47f)
            lineTo(11.591f, 1.47f)
            curveTo(11.298f, 1.177f, 10.823f, 1.177f, 10.53f, 1.47f)
            close()
            moveTo(18f, 12f)
            curveTo(18f, 15.314f, 15.314f, 18f, 12f, 18f)
            curveTo(8.686f, 18f, 6f, 15.314f, 6f, 12f)
            curveTo(6f, 8.686f, 8.686f, 6f, 12f, 6f)
            curveTo(15.314f, 6f, 18f, 8.686f, 18f, 12f)
            close()
            moveTo(10.53f, 9.47f)
            curveTo(10.237f, 9.177f, 9.763f, 9.177f, 9.47f, 9.47f)
            curveTo(9.177f, 9.763f, 9.177f, 10.237f, 9.47f, 10.53f)
            lineTo(10.939f, 12f)
            lineTo(9.47f, 13.47f)
            curveTo(9.177f, 13.763f, 9.177f, 14.237f, 9.47f, 14.53f)
            curveTo(9.763f, 14.823f, 10.237f, 14.823f, 10.53f, 14.53f)
            lineTo(12f, 13.061f)
            lineTo(13.47f, 14.53f)
            curveTo(13.763f, 14.823f, 14.237f, 14.823f, 14.53f, 14.53f)
            curveTo(14.823f, 14.237f, 14.823f, 13.763f, 14.53f, 13.47f)
            lineTo(13.061f, 12f)
            lineTo(14.53f, 10.53f)
            curveTo(14.823f, 10.237f, 14.823f, 9.763f, 14.53f, 9.47f)
            curveTo(14.237f, 9.177f, 13.763f, 9.177f, 13.47f, 9.47f)
            lineTo(12f, 10.939f)
            lineTo(10.53f, 9.47f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun ArrowSyncDismissPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowSyncDismiss, contentDescription = null)
    }
}
