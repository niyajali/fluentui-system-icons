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

public val FluentIcons.Regular.Drafts: ImageVector
    get() {
        if (_Drafts != null) {
            return _Drafts!!
        }
        _Drafts = ImageVector.Builder(
            name = "Regular.Drafts",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(20.878f, 2.826f)
                lineTo(21.031f, 2.97f)
                lineTo(21.176f, 3.123f)
                curveTo(22.427f, 4.528f, 22.379f, 6.683f, 21.031f, 8.031f)
                lineTo(9.063f, 19.999f)
                curveTo(8.786f, 20.276f, 8.442f, 20.476f, 8.064f, 20.579f)
                lineTo(2.948f, 21.974f)
                curveTo(2.388f, 22.127f, 1.875f, 21.613f, 2.027f, 21.053f)
                lineTo(3.422f, 15.937f)
                curveTo(3.525f, 15.559f, 3.725f, 15.215f, 4.002f, 14.938f)
                lineTo(15.97f, 2.97f)
                curveTo(17.318f, 1.622f, 19.473f, 1.574f, 20.878f, 2.826f)
                close()
                moveTo(15.001f, 6.061f)
                lineTo(5.063f, 15.999f)
                curveTo(4.971f, 16.091f, 4.904f, 16.206f, 4.87f, 16.332f)
                lineTo(3.82f, 20.181f)
                lineTo(7.669f, 19.132f)
                curveTo(7.795f, 19.097f, 7.91f, 19.031f, 8.002f, 18.938f)
                lineTo(17.94f, 9f)
                lineTo(15.001f, 6.061f)
                close()
                moveTo(6.526f, 11f)
                lineTo(5.026f, 12.5f)
                lineTo(2.751f, 12.5f)
                curveTo(2.337f, 12.5f, 2.001f, 12.165f, 2.001f, 11.75f)
                curveTo(2.001f, 11.336f, 2.337f, 11f, 2.751f, 11f)
                lineTo(6.526f, 11f)
                close()
                moveTo(10.526f, 7f)
                lineTo(9.026f, 8.5f)
                lineTo(2.751f, 8.5f)
                curveTo(2.337f, 8.5f, 2.001f, 8.165f, 2.001f, 7.75f)
                curveTo(2.001f, 7.336f, 2.337f, 7f, 2.751f, 7f)
                lineTo(10.526f, 7f)
                close()
                moveTo(17.031f, 4.031f)
                lineTo(16.061f, 5f)
                lineTo(19f, 7.94f)
                lineTo(19.971f, 6.97f)
                curveTo(20.782f, 6.158f, 20.782f, 4.842f, 19.971f, 4.031f)
                curveTo(19.159f, 3.219f, 17.843f, 3.219f, 17.031f, 4.031f)
                close()
                moveTo(14.526f, 3f)
                lineTo(13.026f, 4.5f)
                lineTo(2.751f, 4.5f)
                curveTo(2.337f, 4.5f, 2.001f, 4.165f, 2.001f, 3.75f)
                curveTo(2.001f, 3.336f, 2.337f, 3f, 2.751f, 3f)
                lineTo(14.526f, 3f)
                close()
            }
        }.build()

        return _Drafts!!
    }

@Suppress("ObjectPropertyName")
private var _Drafts: ImageVector? = null

@Preview
@Composable
private fun DraftsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Drafts, contentDescription = null)
    }
}
