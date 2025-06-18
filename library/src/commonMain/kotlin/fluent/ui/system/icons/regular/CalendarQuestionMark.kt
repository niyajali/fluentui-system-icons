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

public val FluentUi.Regular.CalendarQuestionMark: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarQuestionMark",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(21f, 6.25f)
            curveTo(21f, 4.455f, 19.545f, 3f, 17.75f, 3f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 3f, 3f, 4.455f, 3f, 6.25f)
            verticalLineTo(17.75f)
            curveTo(3f, 19.545f, 4.455f, 21f, 6.25f, 21f)
            horizontalLineTo(12.022f)
            curveTo(11.725f, 20.537f, 11.486f, 20.034f, 11.314f, 19.5f)
            horizontalLineTo(6.25f)
            curveTo(5.284f, 19.5f, 4.5f, 18.716f, 4.5f, 17.75f)
            verticalLineTo(8.5f)
            horizontalLineTo(19.5f)
            verticalLineTo(11.314f)
            curveTo(20.034f, 11.486f, 20.537f, 11.725f, 21f, 12.022f)
            verticalLineTo(6.25f)
            close()
            moveTo(6.25f, 4.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 4.5f, 19.5f, 5.284f, 19.5f, 6.25f)
            verticalLineTo(7f)
            horizontalLineTo(4.5f)
            verticalLineTo(6.25f)
            curveTo(4.5f, 5.284f, 5.284f, 4.5f, 6.25f, 4.5f)
            close()
            moveTo(23f, 17.5f)
            curveTo(23f, 14.462f, 20.538f, 12f, 17.5f, 12f)
            curveTo(14.462f, 12f, 12f, 14.462f, 12f, 17.5f)
            curveTo(12f, 20.538f, 14.462f, 23f, 17.5f, 23f)
            curveTo(20.538f, 23f, 23f, 20.538f, 23f, 17.5f)
            close()
            moveTo(16.875f, 20.375f)
            curveTo(16.875f, 20.031f, 17.155f, 19.751f, 17.5f, 19.751f)
            curveTo(17.845f, 19.751f, 18.125f, 20.031f, 18.125f, 20.375f)
            curveTo(18.125f, 20.72f, 17.845f, 21f, 17.5f, 21f)
            curveTo(17.155f, 21f, 16.875f, 20.72f, 16.875f, 20.375f)
            close()
            moveTo(15.647f, 15.828f)
            curveTo(15.636f, 14.691f, 16.452f, 13.874f, 17.5f, 13.874f)
            curveTo(18.531f, 13.874f, 19.353f, 14.72f, 19.353f, 15.824f)
            curveTo(19.353f, 16.333f, 19.203f, 16.665f, 18.825f, 17.116f)
            lineTo(18.691f, 17.271f)
            lineTo(18.425f, 17.562f)
            lineTo(18.324f, 17.677f)
            lineTo(18.239f, 17.781f)
            curveTo(18.059f, 18.013f, 18f, 18.168f, 18f, 18.372f)
            curveTo(18f, 18.648f, 17.776f, 18.872f, 17.5f, 18.872f)
            curveTo(17.224f, 18.872f, 17f, 18.648f, 17f, 18.372f)
            curveTo(17f, 17.854f, 17.151f, 17.518f, 17.535f, 17.062f)
            lineTo(17.671f, 16.904f)
            lineTo(17.937f, 16.614f)
            lineTo(18.035f, 16.501f)
            lineTo(18.129f, 16.385f)
            curveTo(18.298f, 16.166f, 18.353f, 16.016f, 18.353f, 15.824f)
            curveTo(18.353f, 15.266f, 17.972f, 14.874f, 17.5f, 14.874f)
            curveTo(17.006f, 14.874f, 16.641f, 15.24f, 16.647f, 15.819f)
            curveTo(16.649f, 16.095f, 16.428f, 16.321f, 16.151f, 16.323f)
            curveTo(15.875f, 16.326f, 15.649f, 16.104f, 15.647f, 15.828f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun CalendarQuestionMarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.CalendarQuestionMark, contentDescription = null)
    }
}
