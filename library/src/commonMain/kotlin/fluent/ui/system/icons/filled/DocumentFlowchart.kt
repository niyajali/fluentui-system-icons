package fluent.ui.system.icons.filled

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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Filled.DocumentFlowchart: ImageVector
    get() {
        if (_DocumentFlowchart != null) {
            return _DocumentFlowchart!!
        }
        _DocumentFlowchart = ImageVector.Builder(
            name = "Filled.DocumentFlowchart",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 8f)
                verticalLineTo(2f)
                horizontalLineTo(6f)
                curveTo(4.895f, 2f, 4f, 2.895f, 4f, 4f)
                verticalLineTo(20f)
                curveTo(4f, 21.105f, 4.895f, 22f, 6f, 22f)
                horizontalLineTo(18f)
                curveTo(19.105f, 22f, 20f, 21.105f, 20f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.895f, 10f, 12f, 9.105f, 12f, 8f)
                close()
                moveTo(6.5f, 8.25f)
                curveTo(6.5f, 7.836f, 6.836f, 7.5f, 7.25f, 7.5f)
                horizontalLineTo(9.75f)
                curveTo(10.164f, 7.5f, 10.5f, 7.836f, 10.5f, 8.25f)
                verticalLineTo(10.75f)
                curveTo(10.5f, 11.164f, 10.164f, 11.5f, 9.75f, 11.5f)
                horizontalLineTo(9.25f)
                verticalLineTo(14.189f)
                lineTo(10.811f, 15.75f)
                horizontalLineTo(13.5f)
                verticalLineTo(15.25f)
                curveTo(13.5f, 14.836f, 13.836f, 14.5f, 14.25f, 14.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 14.5f, 17.5f, 14.836f, 17.5f, 15.25f)
                verticalLineTo(17.75f)
                curveTo(17.5f, 18.164f, 17.164f, 18.5f, 16.75f, 18.5f)
                horizontalLineTo(14.25f)
                curveTo(13.836f, 18.5f, 13.5f, 18.164f, 13.5f, 17.75f)
                verticalLineTo(17.25f)
                horizontalLineTo(10.811f)
                lineTo(9.03f, 19.03f)
                curveTo(8.737f, 19.323f, 8.263f, 19.323f, 7.97f, 19.03f)
                lineTo(5.97f, 17.03f)
                curveTo(5.677f, 16.737f, 5.677f, 16.263f, 5.97f, 15.97f)
                lineTo(7.75f, 14.189f)
                verticalLineTo(11.5f)
                horizontalLineTo(7.25f)
                curveTo(6.836f, 11.5f, 6.5f, 11.164f, 6.5f, 10.75f)
                verticalLineTo(8.25f)
                close()
                moveTo(13.5f, 8f)
                verticalLineTo(2.5f)
                lineTo(19.5f, 8.5f)
                horizontalLineTo(14f)
                curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
                close()
            }
        }.build()

        return _DocumentFlowchart!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentFlowchart: ImageVector? = null

@Preview
@Composable
private fun DocumentFlowchartPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.DocumentFlowchart, contentDescription = null)
    }
}
