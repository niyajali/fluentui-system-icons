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

public val FluentIcons.Filled.BeakerAdd: ImageVector
    get() {
        if (_BeakerAdd != null) {
            return _BeakerAdd!!
        }
        _BeakerAdd = ImageVector.Builder(
            name = "Filled.BeakerAdd",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(8.999f, 4.5f)
                verticalLineTo(10.738f)
                curveTo(8.999f, 11.113f, 8.906f, 11.482f, 8.727f, 11.812f)
                lineTo(7.539f, 14f)
                horizontalLineTo(12.021f)
                curveTo(12.754f, 12.856f, 13.835f, 11.956f, 15.115f, 11.451f)
                curveTo(15.039f, 11.222f, 15f, 10.981f, 15f, 10.738f)
                verticalLineTo(4.5f)
                horizontalLineTo(16f)
                curveTo(16.414f, 4.5f, 16.75f, 4.164f, 16.75f, 3.75f)
                curveTo(16.75f, 3.336f, 16.414f, 3f, 16f, 3f)
                horizontalLineTo(8f)
                curveTo(7.585f, 3f, 7.25f, 3.336f, 7.25f, 3.75f)
                curveTo(7.25f, 4.164f, 7.585f, 4.5f, 8f, 4.5f)
                horizontalLineTo(8.999f)
                close()
                moveTo(6.725f, 15.5f)
                horizontalLineTo(11.313f)
                curveTo(11.109f, 16.13f, 11f, 16.802f, 11f, 17.5f)
                curveTo(11f, 18.789f, 11.375f, 19.99f, 12.021f, 21f)
                horizontalLineTo(6.68f)
                curveTo(5.353f, 21f, 4.509f, 19.581f, 5.142f, 18.415f)
                lineTo(6.725f, 15.5f)
                close()
                moveTo(17.5f, 12f)
                curveTo(20.537f, 12f, 23f, 14.462f, 23f, 17.5f)
                curveTo(23f, 20.538f, 20.537f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                close()
                moveTo(18.001f, 20.503f)
                lineTo(18f, 18f)
                horizontalLineTo(20.503f)
                curveTo(20.779f, 18f, 21.003f, 17.776f, 21.003f, 17.5f)
                curveTo(21.003f, 17.224f, 20.779f, 17f, 20.503f, 17f)
                horizontalLineTo(18f)
                lineTo(18f, 14.499f)
                curveTo(18f, 14.223f, 17.776f, 13.999f, 17.5f, 13.999f)
                curveTo(17.223f, 13.999f, 17f, 14.223f, 17f, 14.499f)
                lineTo(17f, 17f)
                horizontalLineTo(14.496f)
                curveTo(14.219f, 17f, 13.996f, 17.224f, 13.996f, 17.5f)
                curveTo(13.996f, 17.776f, 14.219f, 18f, 14.496f, 18f)
                horizontalLineTo(17f)
                lineTo(17.001f, 20.503f)
                curveTo(17.001f, 20.78f, 17.225f, 21.003f, 17.501f, 21.003f)
                curveTo(17.777f, 21.003f, 18.001f, 20.78f, 18.001f, 20.503f)
                close()
            }
        }.build()

        return _BeakerAdd!!
    }

@Suppress("ObjectPropertyName")
private var _BeakerAdd: ImageVector? = null

@Preview
@Composable
private fun BeakerAddPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.BeakerAdd, contentDescription = null)
    }
}
