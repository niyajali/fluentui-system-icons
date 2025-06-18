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

public val FluentUi.Filled.RoadCone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RoadCone",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.194f, 2f)
            curveTo(10.617f, 2f, 10.115f, 2.394f, 9.979f, 2.955f)
            curveTo(9.288f, 5.797f, 8.444f, 8.904f, 7.594f, 12f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 12f, 13.5f, 12.336f, 13.5f, 12.75f)
            curveTo(13.5f, 13.164f, 13.164f, 13.5f, 12.75f, 13.5f)
            horizontalLineTo(7.181f)
            curveTo(6.997f, 14.17f, 6.813f, 14.838f, 6.632f, 15.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 15.5f, 14.5f, 15.836f, 14.5f, 16.25f)
            curveTo(14.5f, 16.664f, 14.164f, 17f, 13.75f, 17f)
            horizontalLineTo(6.222f)
            curveTo(5.897f, 18.198f, 5.583f, 19.371f, 5.29f, 20.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 20.5f, 2f, 20.836f, 2f, 21.25f)
            curveTo(2f, 21.664f, 2.336f, 22f, 2.75f, 22f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
            curveTo(22f, 20.836f, 21.664f, 20.5f, 21.25f, 20.5f)
            horizontalLineTo(18.709f)
            lineTo(14.024f, 2.928f)
            curveTo(13.878f, 2.381f, 13.382f, 2f, 12.816f, 2f)
            horizontalLineTo(11.194f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RoadConePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.RoadCone, contentDescription = null)
    }
}
