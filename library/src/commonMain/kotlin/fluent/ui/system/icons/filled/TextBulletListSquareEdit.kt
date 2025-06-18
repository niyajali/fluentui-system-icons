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

public val FluentUi.Filled.TextBulletListSquareEdit: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TextBulletListSquareEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(6.25f, 3f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(11.165f)
            lineTo(11.521f, 19.577f)
            curveTo(11.683f, 18.929f, 12.018f, 18.337f, 12.49f, 17.865f)
            lineTo(13.855f, 16.5f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 16.5f, 10.5f, 16.164f, 10.5f, 15.75f)
            curveTo(10.5f, 15.336f, 10.836f, 15f, 11.25f, 15f)
            horizontalLineTo(15.355f)
            lineTo(18.393f, 11.962f)
            curveTo(19.107f, 11.248f, 20.067f, 10.932f, 21f, 11.012f)
            verticalLineTo(6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            close()
            moveTo(8.75f, 8.25f)
            curveTo(8.75f, 8.802f, 8.302f, 9.25f, 7.75f, 9.25f)
            curveTo(7.198f, 9.25f, 6.75f, 8.802f, 6.75f, 8.25f)
            curveTo(6.75f, 7.698f, 7.198f, 7.25f, 7.75f, 7.25f)
            curveTo(8.302f, 7.25f, 8.75f, 7.698f, 8.75f, 8.25f)
            close()
            moveTo(10.5f, 8.25f)
            curveTo(10.5f, 7.836f, 10.836f, 7.5f, 11.25f, 7.5f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 7.5f, 17.5f, 7.836f, 17.5f, 8.25f)
            curveTo(17.5f, 8.664f, 17.164f, 9f, 16.75f, 9f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 9f, 10.5f, 8.664f, 10.5f, 8.25f)
            close()
            moveTo(10.5f, 12f)
            curveTo(10.5f, 11.586f, 10.836f, 11.25f, 11.25f, 11.25f)
            horizontalLineTo(16.75f)
            curveTo(17.164f, 11.25f, 17.5f, 11.586f, 17.5f, 12f)
            curveTo(17.5f, 12.414f, 17.164f, 12.75f, 16.75f, 12.75f)
            horizontalLineTo(11.25f)
            curveTo(10.836f, 12.75f, 10.5f, 12.414f, 10.5f, 12f)
            close()
            moveTo(7.75f, 11f)
            curveTo(8.302f, 11f, 8.75f, 11.448f, 8.75f, 12f)
            curveTo(8.75f, 12.552f, 8.302f, 13f, 7.75f, 13f)
            curveTo(7.198f, 13f, 6.75f, 12.552f, 6.75f, 12f)
            curveTo(6.75f, 11.448f, 7.198f, 11f, 7.75f, 11f)
            close()
            moveTo(8.75f, 15.75f)
            curveTo(8.75f, 16.302f, 8.302f, 16.75f, 7.75f, 16.75f)
            curveTo(7.198f, 16.75f, 6.75f, 16.302f, 6.75f, 15.75f)
            curveTo(6.75f, 15.198f, 7.198f, 14.75f, 7.75f, 14.75f)
            curveTo(8.302f, 14.75f, 8.75f, 15.198f, 8.75f, 15.75f)
            close()
            moveTo(19.1f, 12.67f)
            lineTo(13.197f, 18.572f)
            curveTo(12.853f, 18.916f, 12.609f, 19.347f, 12.491f, 19.819f)
            lineTo(12.033f, 21.65f)
            curveTo(11.834f, 22.446f, 12.556f, 23.167f, 13.352f, 22.968f)
            lineTo(15.182f, 22.511f)
            curveTo(15.655f, 22.393f, 16.086f, 22.149f, 16.43f, 21.804f)
            lineTo(22.332f, 15.902f)
            curveTo(23.225f, 15.009f, 23.225f, 13.562f, 22.332f, 12.67f)
            curveTo(21.44f, 11.777f, 19.993f, 11.777f, 19.1f, 12.67f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TextBulletListSquareEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TextBulletListSquareEdit, contentDescription = null)
    }
}
