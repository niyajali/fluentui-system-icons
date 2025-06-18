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

public val FluentUi.Light.BreakoutRoom: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Light.BreakoutRoom",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f,
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 7.5f)
            curveTo(3f, 5.015f, 5.015f, 3f, 7.5f, 3f)
            horizontalLineTo(24.5f)
            curveTo(26.985f, 3f, 29f, 5.015f, 29f, 7.5f)
            verticalLineTo(24.5f)
            curveTo(29f, 26.985f, 26.985f, 29f, 24.5f, 29f)
            horizontalLineTo(18.469f)
            curveTo(18.806f, 28.702f, 19.11f, 28.366f, 19.374f, 28f)
            horizontalLineTo(24.5f)
            curveTo(26.433f, 28f, 28f, 26.433f, 28f, 24.5f)
            verticalLineTo(7.5f)
            curveTo(28f, 5.567f, 26.433f, 4f, 24.5f, 4f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 4f, 4f, 5.567f, 4f, 7.5f)
            verticalLineTo(12.626f)
            curveTo(3.634f, 12.89f, 3.298f, 13.193f, 3f, 13.531f)
            verticalLineTo(7.5f)
            close()
            moveTo(7.5f, 13f)
            curveTo(5.015f, 13f, 3f, 15.015f, 3f, 17.5f)
            verticalLineTo(24.5f)
            curveTo(3f, 26.985f, 5.015f, 29f, 7.5f, 29f)
            horizontalLineTo(14.5f)
            curveTo(16.985f, 29f, 19f, 26.985f, 19f, 24.5f)
            verticalLineTo(17.5f)
            curveTo(19f, 15.015f, 16.985f, 13f, 14.5f, 13f)
            horizontalLineTo(7.5f)
            close()
            moveTo(4f, 17.5f)
            curveTo(4f, 15.567f, 5.567f, 14f, 7.5f, 14f)
            horizontalLineTo(14.5f)
            curveTo(16.433f, 14f, 18f, 15.567f, 18f, 17.5f)
            verticalLineTo(24.5f)
            curveTo(18f, 26.433f, 16.433f, 28f, 14.5f, 28f)
            horizontalLineTo(7.5f)
            curveTo(5.567f, 28f, 4f, 26.433f, 4f, 24.5f)
            verticalLineTo(17.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BreakoutRoomPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Light.BreakoutRoom, contentDescription = null)
    }
}
