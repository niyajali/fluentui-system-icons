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

public val FluentUi.Light.People: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.People",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6f, 10.5f)
            curveTo(6f, 8.015f, 8.015f, 6f, 10.5f, 6f)
            curveTo(12.985f, 6f, 15f, 8.015f, 15f, 10.5f)
            curveTo(15f, 12.985f, 12.985f, 15f, 10.5f, 15f)
            curveTo(8.015f, 15f, 6f, 12.985f, 6f, 10.5f)
            close()
            moveTo(10.5f, 5f)
            curveTo(7.462f, 5f, 5f, 7.462f, 5f, 10.5f)
            curveTo(5f, 13.538f, 7.462f, 16f, 10.5f, 16f)
            curveTo(13.538f, 16f, 16f, 13.538f, 16f, 10.5f)
            curveTo(16f, 7.462f, 13.538f, 5f, 10.5f, 5f)
            close()
            moveTo(20f, 12f)
            curveTo(20f, 10.343f, 21.343f, 9f, 23f, 9f)
            curveTo(24.657f, 9f, 26f, 10.343f, 26f, 12f)
            curveTo(26f, 13.657f, 24.657f, 15f, 23f, 15f)
            curveTo(21.343f, 15f, 20f, 13.657f, 20f, 12f)
            close()
            moveTo(23f, 8f)
            curveTo(20.791f, 8f, 19f, 9.791f, 19f, 12f)
            curveTo(19f, 14.209f, 20.791f, 16f, 23f, 16f)
            curveTo(25.209f, 16f, 27f, 14.209f, 27f, 12f)
            curveTo(27f, 9.791f, 25.209f, 8f, 23f, 8f)
            close()
            moveTo(5f, 18f)
            curveTo(3.343f, 18f, 2f, 19.343f, 2f, 21f)
            curveTo(2f, 22.116f, 2.417f, 23.63f, 3.719f, 24.863f)
            curveTo(5.024f, 26.099f, 7.161f, 27f, 10.5f, 27f)
            curveTo(13.839f, 27f, 15.976f, 26.099f, 17.281f, 24.863f)
            curveTo(18.583f, 23.63f, 19f, 22.116f, 19f, 21f)
            curveTo(19f, 19.343f, 17.657f, 18f, 16f, 18f)
            horizontalLineTo(5f)
            close()
            moveTo(3f, 21f)
            curveTo(3f, 19.895f, 3.895f, 19f, 5f, 19f)
            horizontalLineTo(16f)
            curveTo(17.104f, 19f, 18f, 19.895f, 18f, 21f)
            curveTo(18f, 21.884f, 17.667f, 23.12f, 16.594f, 24.137f)
            curveTo(15.524f, 25.151f, 13.661f, 26f, 10.5f, 26f)
            curveTo(7.339f, 26f, 5.476f, 25.151f, 4.406f, 24.137f)
            curveTo(3.333f, 23.12f, 3f, 21.884f, 3f, 21f)
            close()
            moveTo(19.963f, 23.588f)
            curveTo(19.835f, 23.889f, 19.682f, 24.19f, 19.501f, 24.488f)
            curveTo(20.427f, 24.806f, 21.578f, 25f, 23f, 25f)
            curveTo(25.842f, 25f, 27.601f, 24.223f, 28.654f, 23.24f)
            curveTo(29.696f, 22.267f, 30f, 21.133f, 30f, 20.5f)
            curveTo(30f, 19.119f, 28.881f, 18f, 27.5f, 18f)
            horizontalLineTo(19.354f)
            curveTo(19.622f, 18.3f, 19.851f, 18.636f, 20.032f, 19f)
            horizontalLineTo(27.5f)
            curveTo(28.328f, 19f, 29f, 19.672f, 29f, 20.5f)
            curveTo(29f, 20.867f, 28.804f, 21.733f, 27.971f, 22.51f)
            curveTo(27.149f, 23.277f, 25.658f, 24f, 23f, 24f)
            curveTo(21.745f, 24f, 20.75f, 23.839f, 19.963f, 23.588f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeoplePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.People, contentDescription = null)
    }
}
