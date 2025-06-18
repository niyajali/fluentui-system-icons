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

public val FluentUi.Regular.BriefcaseSearch: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.BriefcaseSearch",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color(0xFF212121))) {
            moveTo(10.25f, 3.5f)
            horizontalLineTo(13.75f)
            curveTo(14.164f, 3.5f, 14.5f, 3.836f, 14.5f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(9.5f)
            verticalLineTo(4.25f)
            curveTo(9.5f, 3.836f, 9.836f, 3.5f, 10.25f, 3.5f)
            close()
            moveTo(8f, 4.25f)
            verticalLineTo(6f)
            horizontalLineTo(6.25f)
            curveTo(4.455f, 6f, 3f, 7.455f, 3f, 9.25f)
            verticalLineTo(10.6f)
            curveTo(3.466f, 10.362f, 3.969f, 10.188f, 4.5f, 10.091f)
            verticalLineTo(9.25f)
            curveTo(4.5f, 8.283f, 5.284f, 7.5f, 6.25f, 7.5f)
            horizontalLineTo(17.75f)
            curveTo(18.716f, 7.5f, 19.5f, 8.283f, 19.5f, 9.25f)
            verticalLineTo(10.75f)
            curveTo(19.5f, 11.717f, 18.716f, 12.5f, 17.75f, 12.5f)
            horizontalLineTo(14f)
            verticalLineTo(12f)
            curveTo(14f, 11.448f, 13.552f, 11f, 13f, 11f)
            horizontalLineTo(11f)
            curveTo(10.448f, 11f, 10f, 11.448f, 10f, 12f)
            verticalLineTo(12.337f)
            curveTo(10.54f, 13.104f, 10.889f, 14.014f, 10.978f, 15f)
            lineTo(11f, 15f)
            horizontalLineTo(13f)
            curveTo(13.552f, 15f, 14f, 14.552f, 14f, 14f)
            horizontalLineTo(17.75f)
            curveTo(18.394f, 14f, 18.995f, 13.813f, 19.5f, 13.489f)
            verticalLineTo(16.75f)
            curveTo(19.5f, 17.716f, 18.716f, 18.5f, 17.75f, 18.5f)
            horizontalLineTo(10.975f)
            lineTo(12.475f, 20f)
            horizontalLineTo(17.75f)
            curveTo(19.545f, 20f, 21f, 18.545f, 21f, 16.75f)
            verticalLineTo(9.25f)
            curveTo(21f, 7.455f, 19.545f, 6f, 17.75f, 6f)
            horizontalLineTo(16f)
            verticalLineTo(4.25f)
            curveTo(16f, 3.007f, 14.993f, 2f, 13.75f, 2f)
            horizontalLineTo(10.25f)
            curveTo(9.007f, 2f, 8f, 3.007f, 8f, 4.25f)
            close()
            moveTo(5.5f, 20f)
            curveTo(6.472f, 20f, 7.372f, 19.692f, 8.107f, 19.168f)
            lineTo(10.72f, 21.78f)
            curveTo(11.013f, 22.073f, 11.487f, 22.073f, 11.78f, 21.78f)
            curveTo(12.073f, 21.487f, 12.073f, 21.013f, 11.78f, 20.72f)
            lineTo(9.168f, 18.107f)
            curveTo(9.692f, 17.372f, 10f, 16.472f, 10f, 15.5f)
            curveTo(10f, 13.015f, 7.985f, 11f, 5.5f, 11f)
            curveTo(3.015f, 11f, 1f, 13.015f, 1f, 15.5f)
            curveTo(1f, 17.985f, 3.015f, 20f, 5.5f, 20f)
            close()
            moveTo(5.5f, 18.5f)
            curveTo(3.843f, 18.5f, 2.5f, 17.157f, 2.5f, 15.5f)
            curveTo(2.5f, 13.843f, 3.843f, 12.5f, 5.5f, 12.5f)
            curveTo(7.157f, 12.5f, 8.5f, 13.843f, 8.5f, 15.5f)
            curveTo(8.5f, 17.157f, 7.157f, 18.5f, 5.5f, 18.5f)
            close()
        }
    }.build()
}

@Preview
@Composable
private fun BriefcaseSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Regular.BriefcaseSearch, contentDescription = null)
    }
}
