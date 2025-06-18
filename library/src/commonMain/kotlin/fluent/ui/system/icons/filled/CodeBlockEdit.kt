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

public val FluentUi.Filled.CodeBlockEdit: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CodeBlockEdit",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(3f, 6.25f)
            curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(11.017f)
            curveTo(20.052f, 10.921f, 19.07f, 11.236f, 18.344f, 11.962f)
            lineTo(17.828f, 12.478f)
            curveTo(18.072f, 12.183f, 18.056f, 11.746f, 17.78f, 11.47f)
            lineTo(14.53f, 8.22f)
            curveTo(14.237f, 7.927f, 13.763f, 7.927f, 13.47f, 8.22f)
            curveTo(13.177f, 8.513f, 13.177f, 8.987f, 13.47f, 9.28f)
            lineTo(16.189f, 12f)
            lineTo(13.47f, 14.72f)
            curveTo(13.177f, 15.013f, 13.177f, 15.487f, 13.47f, 15.78f)
            curveTo(13.746f, 16.056f, 14.183f, 16.072f, 14.478f, 15.828f)
            lineTo(12.441f, 17.865f)
            curveTo(11.969f, 18.337f, 11.634f, 18.929f, 11.472f, 19.577f)
            lineTo(11.116f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(7.811f, 12f)
            lineTo(10.53f, 9.28f)
            curveTo(10.823f, 8.987f, 10.823f, 8.513f, 10.53f, 8.22f)
            curveTo(10.237f, 7.927f, 9.763f, 7.927f, 9.47f, 8.22f)
            lineTo(6.22f, 11.47f)
            curveTo(5.927f, 11.763f, 5.927f, 12.237f, 6.22f, 12.53f)
            lineTo(9.47f, 15.78f)
            curveTo(9.763f, 16.073f, 10.237f, 16.073f, 10.53f, 15.78f)
            curveTo(10.823f, 15.487f, 10.823f, 15.013f, 10.53f, 14.72f)
            lineTo(7.811f, 12f)
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
private fun CodeBlockEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.CodeBlockEdit, contentDescription = null)
    }
}
