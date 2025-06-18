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

public val FluentUi.Filled.TableColumnTopBottomEdit: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableColumnTopBottomEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(11.166f, 21f)
            horizontalLineTo(9.5f)
            verticalLineTo(19.5f)
            horizontalLineTo(11.542f)
            curveTo(11.535f, 19.525f, 11.528f, 19.551f, 11.522f, 19.577f)
            lineTo(11.166f, 21f)
            close()
            moveTo(21f, 11.012f)
            verticalLineTo(9.5f)
            horizontalLineTo(16f)
            lineTo(16f, 14.356f)
            lineTo(18.394f, 11.962f)
            curveTo(19.107f, 11.249f, 20.067f, 10.932f, 21f, 11.012f)
            close()
            moveTo(21f, 6.25f)
            verticalLineTo(8f)
            horizontalLineTo(16f)
            verticalLineTo(3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            close()
            moveTo(9.5f, 3f)
            horizontalLineTo(14.5f)
            verticalLineTo(4.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(3f)
            close()
            moveTo(6.25f, 3f)
            horizontalLineTo(8f)
            lineTo(8f, 8f)
            horizontalLineTo(3f)
            verticalLineTo(6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            close()
            moveTo(3f, 14.5f)
            verticalLineTo(9.5f)
            horizontalLineTo(8f)
            verticalLineTo(14.5f)
            horizontalLineTo(3f)
            close()
            moveTo(3f, 17.75f)
            verticalLineTo(16f)
            horizontalLineTo(8f)
            lineTo(8f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            close()
            moveTo(14.5f, 14.5f)
            lineTo(14.5f, 9.5f)
            horizontalLineTo(9.5f)
            verticalLineTo(14.5f)
            horizontalLineTo(14.5f)
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
private fun TableColumnTopBottomEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TableColumnTopBottomEdit, contentDescription = null)
    }
}
