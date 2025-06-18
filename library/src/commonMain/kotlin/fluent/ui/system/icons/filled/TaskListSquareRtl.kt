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

public val FluentUi.Filled.TaskListSquareRtl: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TaskListSquareRtl",
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
            verticalLineTo(17.75f)
            curveTo(21f, 19.545f, 19.545f, 21f, 17.75f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(6.25f)
            close()
            moveTo(7.25f, 14f)
            curveTo(6.836f, 14f, 6.5f, 14.336f, 6.5f, 14.75f)
            curveTo(6.5f, 15.164f, 6.836f, 15.5f, 7.25f, 15.5f)
            horizontalLineTo(10.75f)
            curveTo(11.164f, 15.5f, 11.5f, 15.164f, 11.5f, 14.75f)
            curveTo(11.5f, 14.336f, 11.164f, 14f, 10.75f, 14f)
            horizontalLineTo(7.25f)
            close()
            moveTo(6.5f, 9.25f)
            curveTo(6.5f, 9.664f, 6.836f, 10f, 7.25f, 10f)
            horizontalLineTo(10.75f)
            curveTo(11.164f, 10f, 11.5f, 9.664f, 11.5f, 9.25f)
            curveTo(11.5f, 8.836f, 11.164f, 8.5f, 10.75f, 8.5f)
            horizontalLineTo(7.25f)
            curveTo(6.836f, 8.5f, 6.5f, 8.836f, 6.5f, 9.25f)
            close()
            moveTo(17.78f, 8.78f)
            curveTo(18.073f, 8.487f, 18.073f, 8.013f, 17.78f, 7.72f)
            curveTo(17.487f, 7.427f, 17.013f, 7.427f, 16.72f, 7.72f)
            lineTo(15.25f, 9.189f)
            lineTo(14.78f, 8.72f)
            curveTo(14.487f, 8.427f, 14.013f, 8.427f, 13.72f, 8.72f)
            curveTo(13.427f, 9.013f, 13.427f, 9.487f, 13.72f, 9.78f)
            lineTo(14.72f, 10.78f)
            curveTo(15.013f, 11.073f, 15.487f, 11.073f, 15.78f, 10.78f)
            lineTo(17.78f, 8.78f)
            close()
            moveTo(17.78f, 13.22f)
            curveTo(17.487f, 12.927f, 17.013f, 12.927f, 16.72f, 13.22f)
            lineTo(15.25f, 14.689f)
            lineTo(14.78f, 14.22f)
            curveTo(14.487f, 13.927f, 14.013f, 13.927f, 13.72f, 14.22f)
            curveTo(13.427f, 14.513f, 13.427f, 14.987f, 13.72f, 15.28f)
            lineTo(14.72f, 16.28f)
            curveTo(15.013f, 16.573f, 15.487f, 16.573f, 15.78f, 16.28f)
            lineTo(17.78f, 14.28f)
            curveTo(18.073f, 13.987f, 18.073f, 13.513f, 17.78f, 13.22f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun TaskListSquareRtlPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.TaskListSquareRtl, contentDescription = null)
    }
}
