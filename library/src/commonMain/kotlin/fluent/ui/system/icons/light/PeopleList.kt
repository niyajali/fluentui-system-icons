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

public val FluentUi.Light.PeopleList: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PeopleList",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 5f)
            curveTo(7.462f, 5f, 5f, 7.462f, 5f, 10.5f)
            curveTo(5f, 13.538f, 7.462f, 16f, 10.5f, 16f)
            curveTo(13.538f, 16f, 16f, 13.538f, 16f, 10.5f)
            curveTo(16f, 7.462f, 13.538f, 5f, 10.5f, 5f)
            close()
            moveTo(6f, 10.5f)
            curveTo(6f, 8.015f, 8.015f, 6f, 10.5f, 6f)
            curveTo(12.985f, 6f, 15f, 8.015f, 15f, 10.5f)
            curveTo(15f, 12.985f, 12.985f, 15f, 10.5f, 15f)
            curveTo(8.015f, 15f, 6f, 12.985f, 6f, 10.5f)
            close()
            moveTo(23f, 8f)
            curveTo(20.791f, 8f, 19f, 9.791f, 19f, 12f)
            curveTo(19f, 14.209f, 20.791f, 16f, 23f, 16f)
            curveTo(25.209f, 16f, 27f, 14.209f, 27f, 12f)
            curveTo(27f, 9.791f, 25.209f, 8f, 23f, 8f)
            close()
            moveTo(20f, 12f)
            curveTo(20f, 10.343f, 21.343f, 9f, 23f, 9f)
            curveTo(24.657f, 9f, 26f, 10.343f, 26f, 12f)
            curveTo(26f, 13.657f, 24.657f, 15f, 23f, 15f)
            curveTo(21.343f, 15f, 20f, 13.657f, 20f, 12f)
            close()
            moveTo(5f, 18f)
            curveTo(3.343f, 18f, 2f, 19.343f, 2f, 21f)
            curveTo(2f, 22.116f, 2.417f, 23.63f, 3.719f, 24.863f)
            curveTo(5.024f, 26.099f, 7.161f, 27f, 10.5f, 27f)
            curveTo(12.127f, 27f, 13.468f, 26.786f, 14.567f, 26.424f)
            curveTo(14.703f, 25.846f, 15.04f, 25.346f, 15.5f, 25f)
            curveTo(15.483f, 24.987f, 15.466f, 24.974f, 15.45f, 24.961f)
            curveTo(14.333f, 25.572f, 12.743f, 26f, 10.5f, 26f)
            curveTo(7.339f, 26f, 5.476f, 25.151f, 4.406f, 24.137f)
            curveTo(3.333f, 23.12f, 3f, 21.884f, 3f, 21f)
            curveTo(3f, 19.895f, 3.895f, 19f, 5f, 19f)
            horizontalLineTo(14.5f)
            curveTo(14.5f, 18.644f, 14.574f, 18.306f, 14.708f, 18f)
            horizontalLineTo(5f)
            close()
            moveTo(17f, 18f)
            curveTo(16.448f, 18f, 16f, 18.448f, 16f, 19f)
            curveTo(16f, 19.552f, 16.448f, 20f, 17f, 20f)
            horizontalLineTo(29f)
            curveTo(29.552f, 20f, 30f, 19.552f, 30f, 19f)
            curveTo(30f, 18.448f, 29.552f, 18f, 29f, 18f)
            horizontalLineTo(17f)
            close()
            moveTo(17f, 22f)
            curveTo(16.448f, 22f, 16f, 22.448f, 16f, 23f)
            curveTo(16f, 23.552f, 16.448f, 24f, 17f, 24f)
            horizontalLineTo(29f)
            curveTo(29.552f, 24f, 30f, 23.552f, 30f, 23f)
            curveTo(30f, 22.448f, 29.552f, 22f, 29f, 22f)
            horizontalLineTo(17f)
            close()
            moveTo(16f, 27f)
            curveTo(16f, 26.448f, 16.448f, 26f, 17f, 26f)
            horizontalLineTo(29f)
            curveTo(29.552f, 26f, 30f, 26.448f, 30f, 27f)
            curveTo(30f, 27.552f, 29.552f, 28f, 29f, 28f)
            horizontalLineTo(17f)
            curveTo(16.448f, 28f, 16f, 27.552f, 16f, 27f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleListPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.PeopleList, contentDescription = null)
    }
}
