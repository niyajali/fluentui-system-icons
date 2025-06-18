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

public val FluentUi.Light.PeopleEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PeopleEdit",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 5f)
            curveTo(8.015f, 5f, 6f, 7.015f, 6f, 9.5f)
            curveTo(6f, 11.985f, 8.015f, 14f, 10.5f, 14f)
            curveTo(12.985f, 14f, 15f, 11.985f, 15f, 9.5f)
            curveTo(15f, 7.015f, 12.985f, 5f, 10.5f, 5f)
            close()
            moveTo(5f, 9.5f)
            curveTo(5f, 6.462f, 7.462f, 4f, 10.5f, 4f)
            curveTo(13.538f, 4f, 16f, 6.462f, 16f, 9.5f)
            curveTo(16f, 12.538f, 13.538f, 15f, 10.5f, 15f)
            curveTo(7.462f, 15f, 5f, 12.538f, 5f, 9.5f)
            close()
            moveTo(23f, 8f)
            curveTo(21.343f, 8f, 20f, 9.343f, 20f, 11f)
            curveTo(20f, 12.657f, 21.343f, 14f, 23f, 14f)
            curveTo(24.657f, 14f, 26f, 12.657f, 26f, 11f)
            curveTo(26f, 9.343f, 24.657f, 8f, 23f, 8f)
            close()
            moveTo(19f, 11f)
            curveTo(19f, 8.791f, 20.791f, 7f, 23f, 7f)
            curveTo(25.209f, 7f, 27f, 8.791f, 27f, 11f)
            curveTo(27f, 13.209f, 25.209f, 15f, 23f, 15f)
            curveTo(20.791f, 15f, 19f, 13.209f, 19f, 11f)
            close()
            moveTo(2f, 20f)
            curveTo(2f, 18.343f, 3.343f, 17f, 5f, 17f)
            horizontalLineTo(16f)
            curveTo(17.657f, 17f, 19f, 18.343f, 19f, 20f)
            curveTo(19f, 20.739f, 18.817f, 21.652f, 18.316f, 22.542f)
            lineTo(16.184f, 24.693f)
            curveTo(14.873f, 25.482f, 13.032f, 26f, 10.5f, 26f)
            curveTo(7.161f, 26f, 5.024f, 25.099f, 3.719f, 23.863f)
            curveTo(2.417f, 22.63f, 2f, 21.116f, 2f, 20f)
            close()
            moveTo(5f, 18f)
            curveTo(3.895f, 18f, 3f, 18.895f, 3f, 20f)
            curveTo(3f, 20.884f, 3.333f, 22.12f, 4.406f, 23.137f)
            curveTo(5.476f, 24.151f, 7.339f, 25f, 10.5f, 25f)
            curveTo(13.661f, 25f, 15.524f, 24.151f, 16.594f, 23.137f)
            curveTo(17.667f, 22.12f, 18f, 20.884f, 18f, 20f)
            curveTo(18f, 18.895f, 17.104f, 18f, 16f, 18f)
            horizontalLineTo(5f)
            close()
            moveTo(29.644f, 21.424f)
            lineTo(21.035f, 29.967f)
            curveTo(20.683f, 30.316f, 20.245f, 30.565f, 19.765f, 30.688f)
            lineTo(16.746f, 31.466f)
            curveTo(16.008f, 31.656f, 15.338f, 30.984f, 15.529f, 30.247f)
            lineTo(16.319f, 27.195f)
            curveTo(16.437f, 26.74f, 16.674f, 26.324f, 17.005f, 25.99f)
            lineTo(25.572f, 17.35f)
            curveTo(26.72f, 16.191f, 28.6f, 16.217f, 29.716f, 17.407f)
            curveTo(30.783f, 18.545f, 30.751f, 20.325f, 29.644f, 21.424f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.PeopleEdit, contentDescription = null)
    }
}
