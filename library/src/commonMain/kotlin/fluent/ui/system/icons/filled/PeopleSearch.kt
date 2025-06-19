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

public val FluentIcons.Filled.PeopleSearch: ImageVector
    get() {
        if (_PeopleSearch != null) {
            return _PeopleSearch!!
        }
        _PeopleSearch = ImageVector.Builder(
            name = "Filled.PeopleSearch",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.909f, 14f)
                lineTo(19.753f, 14f)
                curveTo(20.996f, 14f, 22.003f, 15.007f, 22.003f, 16.25f)
                verticalLineTo(17.155f)
                curveTo(22.003f, 18.249f, 21.526f, 19.288f, 20.696f, 20f)
                curveTo(19.13f, 21.344f, 16.89f, 22.001f, 14f, 22.001f)
                lineTo(13.821f, 22f)
                curveTo(14.123f, 21.392f, 14.049f, 20.644f, 13.599f, 20.104f)
                lineTo(13.489f, 19.983f)
                lineTo(11.259f, 17.759f)
                curveTo(11.739f, 16.932f, 12f, 15.985f, 12f, 15f)
                curveTo(12f, 14.659f, 11.969f, 14.324f, 11.909f, 14f)
                close()
                moveTo(6.5f, 10.5f)
                curveTo(8.985f, 10.5f, 11f, 12.515f, 11f, 15f)
                curveTo(11f, 16.094f, 10.61f, 17.097f, 9.961f, 17.877f)
                lineTo(12.783f, 20.691f)
                curveTo(13.076f, 20.983f, 13.077f, 21.458f, 12.784f, 21.751f)
                curveTo(12.518f, 22.018f, 12.101f, 22.043f, 11.808f, 21.825f)
                lineTo(11.723f, 21.753f)
                lineTo(8.82f, 18.857f)
                curveTo(8.143f, 19.265f, 7.349f, 19.5f, 6.5f, 19.5f)
                curveTo(4.015f, 19.5f, 2f, 17.486f, 2f, 15f)
                curveTo(2f, 12.515f, 4.015f, 10.5f, 6.5f, 10.5f)
                close()
                moveTo(6.5f, 12f)
                curveTo(4.843f, 12f, 3.5f, 13.343f, 3.5f, 15f)
                curveTo(3.5f, 16.657f, 4.843f, 18f, 6.5f, 18f)
                curveTo(8.157f, 18f, 9.5f, 16.657f, 9.5f, 15f)
                curveTo(9.5f, 13.343f, 8.157f, 12f, 6.5f, 12f)
                close()
                moveTo(14f, 2.005f)
                curveTo(16.761f, 2.005f, 19f, 4.243f, 19f, 7.005f)
                curveTo(19f, 9.766f, 16.761f, 12.005f, 14f, 12.005f)
                curveTo(11.239f, 12.005f, 9f, 9.766f, 9f, 7.005f)
                curveTo(9f, 4.243f, 11.239f, 2.005f, 14f, 2.005f)
                close()
            }
        }.build()

        return _PeopleSearch!!
    }

@Suppress("ObjectPropertyName")
private var _PeopleSearch: ImageVector? = null

@Preview
@Composable
private fun PeopleSearchPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.PeopleSearch, contentDescription = null)
    }
}
