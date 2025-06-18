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
import fluent.ui.system.icons.FluentUi

public val FluentUi.Regular.RoadCone: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.RoadCone",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.184f, 2f)
            curveTo(10.618f, 2f, 10.122f, 2.381f, 9.976f, 2.928f)
            lineTo(5.29f, 20.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 20.5f, 2f, 20.836f, 2f, 21.25f)
            curveTo(2f, 21.664f, 2.336f, 22f, 2.75f, 22f)
            horizontalLineTo(21.25f)
            curveTo(21.664f, 22f, 22f, 21.664f, 22f, 21.25f)
            curveTo(22f, 20.836f, 21.664f, 20.5f, 21.25f, 20.5f)
            horizontalLineTo(18.709f)
            lineTo(14.024f, 2.928f)
            curveTo(13.878f, 2.381f, 13.382f, 2f, 12.816f, 2f)
            horizontalLineTo(11.184f)
            close()
            moveTo(6.843f, 20.5f)
            lineTo(7.776f, 17f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 17f, 14.5f, 16.664f, 14.5f, 16.25f)
            curveTo(14.5f, 15.836f, 14.164f, 15.5f, 13.75f, 15.5f)
            horizontalLineTo(8.176f)
            lineTo(8.71f, 13.5f)
            horizontalLineTo(12.75f)
            curveTo(13.164f, 13.5f, 13.5f, 13.164f, 13.5f, 12.75f)
            curveTo(13.5f, 12.336f, 13.164f, 12f, 12.75f, 12f)
            horizontalLineTo(9.11f)
            lineTo(11.376f, 3.5f)
            horizontalLineTo(12.624f)
            lineTo(17.157f, 20.5f)
            horizontalLineTo(6.843f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun RoadConePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.RoadCone, contentDescription = null)
    }
}
