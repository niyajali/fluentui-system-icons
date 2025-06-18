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

public val FluentUi.Regular.DocumentPill: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DocumentPill",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(5.5f, 4.25f)
            curveTo(5.5f, 3.836f, 5.836f, 3.5f, 6.25f, 3.5f)
            horizontalLineTo(12f)
            verticalLineTo(8f)
            curveTo(12f, 9.105f, 12.895f, 10f, 14f, 10f)
            horizontalLineTo(18.5f)
            verticalLineTo(11.43f)
            curveTo(18.979f, 11.229f, 19.489f, 11.129f, 20f, 11.129f)
            verticalLineTo(9.664f)
            curveTo(20f, 9.2f, 19.816f, 8.755f, 19.487f, 8.427f)
            lineTo(13.573f, 2.513f)
            curveTo(13.245f, 2.184f, 12.8f, 2f, 12.336f, 2f)
            horizontalLineTo(6.25f)
            curveTo(5.007f, 2f, 4f, 3.007f, 4f, 4.25f)
            verticalLineTo(19.75f)
            curveTo(4f, 20.993f, 5.007f, 22f, 6.25f, 22f)
            horizontalLineTo(11.684f)
            curveTo(11.403f, 21.535f, 11.229f, 21.023f, 11.161f, 20.5f)
            horizontalLineTo(6.25f)
            curveTo(5.836f, 20.5f, 5.5f, 20.164f, 5.5f, 19.75f)
            verticalLineTo(4.25f)
            close()
            moveTo(17.439f, 8.5f)
            horizontalLineTo(14f)
            curveTo(13.724f, 8.5f, 13.5f, 8.276f, 13.5f, 8f)
            verticalLineTo(4.561f)
            lineTo(17.439f, 8.5f)
            close()
            moveTo(22.03f, 12.97f)
            curveTo(20.909f, 11.849f, 19.091f, 11.849f, 17.97f, 12.97f)
            lineTo(12.97f, 17.97f)
            curveTo(11.848f, 19.091f, 11.848f, 20.909f, 12.97f, 22.031f)
            curveTo(14.091f, 23.152f, 15.909f, 23.152f, 17.03f, 22.031f)
            lineTo(22.03f, 17.031f)
            curveTo(23.152f, 15.909f, 23.152f, 14.091f, 22.03f, 12.97f)
            close()
            moveTo(19.03f, 14.031f)
            curveTo(19.566f, 13.495f, 20.434f, 13.495f, 20.97f, 14.031f)
            curveTo(21.505f, 14.566f, 21.505f, 15.434f, 20.97f, 15.97f)
            lineTo(19f, 17.94f)
            lineTo(17.061f, 16f)
            lineTo(19.03f, 14.031f)
            close()
            moveTo(17.03f, 18.97f)
            curveTo(17.323f, 19.263f, 17.323f, 19.737f, 17.03f, 20.03f)
            lineTo(16.03f, 21.03f)
            curveTo(15.737f, 21.323f, 15.263f, 21.323f, 14.97f, 21.03f)
            curveTo(14.677f, 20.737f, 14.677f, 20.263f, 14.97f, 19.97f)
            lineTo(15.97f, 18.97f)
            curveTo(16.263f, 18.677f, 16.737f, 18.677f, 17.03f, 18.97f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun DocumentPillPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.DocumentPill, contentDescription = null)
    }
}
