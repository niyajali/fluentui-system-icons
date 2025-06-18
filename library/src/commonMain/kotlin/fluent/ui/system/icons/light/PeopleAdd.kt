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

public val FluentUi.Light.PeopleAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.PeopleAdd",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.5f, 4f)
            curveTo(7.462f, 4f, 5f, 6.462f, 5f, 9.5f)
            curveTo(5f, 12.538f, 7.462f, 15f, 10.5f, 15f)
            curveTo(13.538f, 15f, 16f, 12.538f, 16f, 9.5f)
            curveTo(16f, 6.462f, 13.538f, 4f, 10.5f, 4f)
            close()
            moveTo(6f, 9.5f)
            curveTo(6f, 7.015f, 8.015f, 5f, 10.5f, 5f)
            curveTo(12.985f, 5f, 15f, 7.015f, 15f, 9.5f)
            curveTo(15f, 11.985f, 12.985f, 14f, 10.5f, 14f)
            curveTo(8.015f, 14f, 6f, 11.985f, 6f, 9.5f)
            close()
            moveTo(23f, 7f)
            curveTo(20.791f, 7f, 19f, 8.791f, 19f, 11f)
            curveTo(19f, 13.209f, 20.791f, 15f, 23f, 15f)
            curveTo(25.209f, 15f, 27f, 13.209f, 27f, 11f)
            curveTo(27f, 8.791f, 25.209f, 7f, 23f, 7f)
            close()
            moveTo(20f, 11f)
            curveTo(20f, 9.343f, 21.343f, 8f, 23f, 8f)
            curveTo(24.657f, 8f, 26f, 9.343f, 26f, 11f)
            curveTo(26f, 12.657f, 24.657f, 14f, 23f, 14f)
            curveTo(21.343f, 14f, 20f, 12.657f, 20f, 11f)
            close()
            moveTo(16f, 17f)
            curveTo(16.387f, 17f, 16.757f, 17.073f, 17.096f, 17.207f)
            curveTo(16.806f, 17.46f, 16.531f, 17.731f, 16.275f, 18.019f)
            curveTo(16.185f, 18.006f, 16.093f, 18f, 16f, 18f)
            horizontalLineTo(5f)
            curveTo(3.895f, 18f, 3f, 18.895f, 3f, 20f)
            curveTo(3f, 20.884f, 3.333f, 22.12f, 4.406f, 23.137f)
            curveTo(5.476f, 24.151f, 7.339f, 25f, 10.5f, 25f)
            curveTo(11.918f, 25f, 13.075f, 24.829f, 14.017f, 24.549f)
            curveTo(14.037f, 24.89f, 14.076f, 25.226f, 14.134f, 25.556f)
            curveTo(13.121f, 25.837f, 11.919f, 26f, 10.5f, 26f)
            curveTo(7.161f, 26f, 5.024f, 25.099f, 3.719f, 23.863f)
            curveTo(2.417f, 22.63f, 2f, 21.116f, 2f, 20f)
            curveTo(2f, 18.343f, 3.343f, 17f, 5f, 17f)
            horizontalLineTo(16f)
            close()
            moveTo(23f, 31.5f)
            curveTo(18.858f, 31.5f, 15.5f, 28.142f, 15.5f, 24f)
            curveTo(15.5f, 19.858f, 18.858f, 16.5f, 23f, 16.5f)
            curveTo(27.142f, 16.5f, 30.5f, 19.858f, 30.5f, 24f)
            curveTo(30.5f, 28.142f, 27.142f, 31.5f, 23f, 31.5f)
            close()
            moveTo(24f, 19.25f)
            curveTo(24f, 18.836f, 23.664f, 18.5f, 23.25f, 18.5f)
            curveTo(22.836f, 18.5f, 22.5f, 18.836f, 22.5f, 19.25f)
            verticalLineTo(23f)
            horizontalLineTo(18.75f)
            curveTo(18.336f, 23f, 18f, 23.336f, 18f, 23.75f)
            curveTo(18f, 24.164f, 18.336f, 24.5f, 18.75f, 24.5f)
            horizontalLineTo(22.5f)
            verticalLineTo(28.25f)
            curveTo(22.5f, 28.664f, 22.836f, 29f, 23.25f, 29f)
            curveTo(23.664f, 29f, 24f, 28.664f, 24f, 28.25f)
            verticalLineTo(24.5f)
            horizontalLineTo(27.75f)
            curveTo(28.164f, 24.5f, 28.5f, 24.164f, 28.5f, 23.75f)
            curveTo(28.5f, 23.336f, 28.164f, 23f, 27.75f, 23f)
            horizontalLineTo(24f)
            verticalLineTo(19.25f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun PeopleAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.PeopleAdd, contentDescription = null)
    }
}
