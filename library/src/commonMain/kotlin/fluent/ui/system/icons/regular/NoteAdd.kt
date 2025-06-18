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

public val FluentUi.Regular.NoteAdd: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NoteAdd",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(12f, 6.5f)
            curveTo(12f, 3.462f, 9.538f, 1f, 6.5f, 1f)
            curveTo(3.462f, 1f, 1f, 3.462f, 1f, 6.5f)
            curveTo(1f, 9.538f, 3.462f, 12f, 6.5f, 12f)
            curveTo(9.538f, 12f, 12f, 9.538f, 12f, 6.5f)
            close()
            moveTo(7.001f, 7f)
            lineTo(7.001f, 9.504f)
            curveTo(7.001f, 9.78f, 6.777f, 10.003f, 6.501f, 10.003f)
            curveTo(6.225f, 10.003f, 6.001f, 9.78f, 6.001f, 9.504f)
            lineTo(6.001f, 7f)
            horizontalLineTo(3.496f)
            curveTo(3.22f, 7f, 2.996f, 6.776f, 2.996f, 6.5f)
            curveTo(2.996f, 6.224f, 3.22f, 6f, 3.496f, 6f)
            horizontalLineTo(6f)
            lineTo(6f, 3.499f)
            curveTo(6f, 3.223f, 6.224f, 2.999f, 6.5f, 2.999f)
            curveTo(6.776f, 2.999f, 7f, 3.223f, 7f, 3.499f)
            lineTo(7f, 6f)
            horizontalLineTo(9.503f)
            curveTo(9.779f, 6f, 10.003f, 6.224f, 10.003f, 6.5f)
            curveTo(10.003f, 6.776f, 9.779f, 7f, 9.503f, 7f)
            horizontalLineTo(7.001f)
            close()
            moveTo(17.75f, 4.5f)
            horizontalLineTo(12.686f)
            curveTo(12.514f, 3.967f, 12.275f, 3.463f, 11.978f, 3f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 3f, 21f, 4.455f, 21f, 6.25f)
            verticalLineTo(13.129f)
            curveTo(21f, 13.725f, 20.763f, 14.298f, 20.341f, 14.72f)
            lineTo(14.72f, 20.341f)
            curveTo(14.298f, 20.763f, 13.725f, 21f, 13.129f, 21f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 21f, 3f, 19.545f, 3f, 17.75f)
            verticalLineTo(11.978f)
            curveTo(3.463f, 12.275f, 3.967f, 12.514f, 4.5f, 12.686f)
            verticalLineTo(17.75f)
            curveTo(4.5f, 18.716f, 5.284f, 19.5f, 6.25f, 19.5f)
            horizontalLineTo(13f)
            verticalLineTo(16.25f)
            curveTo(13f, 14.517f, 14.356f, 13.101f, 16.066f, 13.005f)
            lineTo(16.25f, 13f)
            horizontalLineTo(19.5f)
            verticalLineTo(6.25f)
            curveTo(19.5f, 5.284f, 18.716f, 4.5f, 17.75f, 4.5f)
            close()
            moveTo(18.439f, 14.5f)
            horizontalLineTo(16.25f)
            curveTo(15.332f, 14.5f, 14.579f, 15.207f, 14.506f, 16.107f)
            lineTo(14.5f, 16.25f)
            verticalLineTo(18.439f)
            lineTo(18.439f, 14.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun NoteAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.NoteAdd, contentDescription = null)
    }
}
