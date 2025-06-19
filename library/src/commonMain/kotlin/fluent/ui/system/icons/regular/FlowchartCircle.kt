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
import fluent.ui.system.icons.FluentIcons

public val FluentIcons.Regular.FlowchartCircle: ImageVector
    get() {
        if (_FlowchartCircle != null) {
            return _FlowchartCircle!!
        }
        _FlowchartCircle = ImageVector.Builder(
            name = "Regular.FlowchartCircle",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(7.25f, 6.5f)
                curveTo(6.836f, 6.5f, 6.5f, 6.836f, 6.5f, 7.25f)
                verticalLineTo(9.75f)
                curveTo(6.5f, 10.164f, 6.836f, 10.5f, 7.25f, 10.5f)
                horizontalLineTo(7.75f)
                verticalLineTo(13.189f)
                lineTo(5.97f, 14.97f)
                curveTo(5.677f, 15.263f, 5.677f, 15.737f, 5.97f, 16.03f)
                lineTo(7.97f, 18.03f)
                curveTo(8.263f, 18.323f, 8.737f, 18.323f, 9.03f, 18.03f)
                lineTo(10.811f, 16.25f)
                horizontalLineTo(13.5f)
                verticalLineTo(16.75f)
                curveTo(13.5f, 17.164f, 13.836f, 17.5f, 14.25f, 17.5f)
                horizontalLineTo(16.75f)
                curveTo(17.164f, 17.5f, 17.5f, 17.164f, 17.5f, 16.75f)
                verticalLineTo(14.25f)
                curveTo(17.5f, 13.836f, 17.164f, 13.5f, 16.75f, 13.5f)
                horizontalLineTo(14.25f)
                curveTo(13.836f, 13.5f, 13.5f, 13.836f, 13.5f, 14.25f)
                verticalLineTo(14.75f)
                horizontalLineTo(10.811f)
                lineTo(9.25f, 13.189f)
                verticalLineTo(10.5f)
                horizontalLineTo(9.75f)
                curveTo(10.164f, 10.5f, 10.5f, 10.164f, 10.5f, 9.75f)
                verticalLineTo(7.25f)
                curveTo(10.5f, 6.836f, 10.164f, 6.5f, 9.75f, 6.5f)
                horizontalLineTo(7.25f)
                close()
                moveTo(2f, 12f)
                curveTo(2f, 6.477f, 6.477f, 2f, 12f, 2f)
                curveTo(17.523f, 2f, 22f, 6.477f, 22f, 12f)
                curveTo(22f, 17.523f, 17.523f, 22f, 12f, 22f)
                curveTo(6.477f, 22f, 2f, 17.523f, 2f, 12f)
                close()
                moveTo(12f, 3.5f)
                curveTo(7.306f, 3.5f, 3.5f, 7.306f, 3.5f, 12f)
                curveTo(3.5f, 16.694f, 7.306f, 20.5f, 12f, 20.5f)
                curveTo(16.694f, 20.5f, 20.5f, 16.694f, 20.5f, 12f)
                curveTo(20.5f, 7.306f, 16.694f, 3.5f, 12f, 3.5f)
                close()
            }
        }.build()

        return _FlowchartCircle!!
    }

@Suppress("ObjectPropertyName")
private var _FlowchartCircle: ImageVector? = null

@Preview
@Composable
private fun FlowchartCirclePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.FlowchartCircle, contentDescription = null)
    }
}
