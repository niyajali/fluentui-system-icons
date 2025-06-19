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

public val FluentIcons.Filled.ImageEdit: ImageVector
    get() {
        if (_ImageEdit != null) {
            return _ImageEdit!!
        }
        _ImageEdit = ImageVector.Builder(
            name = "Filled.ImageEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(11.557f, 13.646f)
                lineTo(11.474f, 13.717f)
                lineTo(4.547f, 20.517f)
                curveTo(5.042f, 20.822f, 5.625f, 20.998f, 6.25f, 20.998f)
                horizontalLineTo(11.164f)
                lineTo(11.52f, 19.575f)
                curveTo(11.682f, 18.927f, 12.017f, 18.336f, 12.489f, 17.864f)
                lineTo(14.599f, 15.754f)
                lineTo(12.525f, 13.717f)
                lineTo(12.431f, 13.639f)
                curveTo(12.17f, 13.454f, 11.817f, 13.457f, 11.557f, 13.646f)
                close()
                moveTo(16.503f, 8.252f)
                curveTo(16.503f, 7.836f, 16.166f, 7.5f, 15.751f, 7.5f)
                curveTo(15.336f, 7.5f, 14.999f, 7.836f, 14.999f, 8.252f)
                curveTo(14.999f, 8.667f, 15.336f, 9.004f, 15.751f, 9.004f)
                curveTo(16.166f, 9.004f, 16.503f, 8.667f, 16.503f, 8.252f)
                close()
                moveTo(15.66f, 14.693f)
                lineTo(13.575f, 12.647f)
                lineTo(13.447f, 12.53f)
                curveTo(12.614f, 11.828f, 11.393f, 11.826f, 10.559f, 12.524f)
                lineTo(10.423f, 12.647f)
                lineTo(3.485f, 19.458f)
                curveTo(3.178f, 18.961f, 3f, 18.376f, 3f, 17.749f)
                verticalLineTo(6.25f)
                curveTo(3f, 4.455f, 4.455f, 3f, 6.25f, 3f)
                horizontalLineTo(17.749f)
                curveTo(19.544f, 3f, 20.998f, 4.455f, 20.998f, 6.25f)
                verticalLineTo(11.012f)
                curveTo(20.066f, 10.931f, 19.105f, 11.248f, 18.391f, 11.962f)
                lineTo(15.66f, 14.693f)
                close()
                moveTo(13.499f, 8.252f)
                curveTo(13.499f, 9.495f, 14.507f, 10.504f, 15.751f, 10.504f)
                curveTo(16.995f, 10.504f, 18.003f, 9.495f, 18.003f, 8.252f)
                curveTo(18.003f, 7.008f, 16.995f, 6f, 15.751f, 6f)
                curveTo(14.507f, 6f, 13.499f, 7.008f, 13.499f, 8.252f)
                close()
                moveTo(19.098f, 12.669f)
                lineTo(13.196f, 18.57f)
                curveTo(12.852f, 18.915f, 12.608f, 19.346f, 12.49f, 19.818f)
                lineTo(12.033f, 21.648f)
                curveTo(11.834f, 22.444f, 12.555f, 23.166f, 13.351f, 22.967f)
                lineTo(15.181f, 22.509f)
                curveTo(15.653f, 22.391f, 16.085f, 22.147f, 16.429f, 21.803f)
                lineTo(22.331f, 15.901f)
                curveTo(23.223f, 15.008f, 23.223f, 13.561f, 22.331f, 12.669f)
                curveTo(21.438f, 11.776f, 19.991f, 11.776f, 19.098f, 12.669f)
                close()
            }
        }.build()

        return _ImageEdit!!
    }

@Suppress("ObjectPropertyName")
private var _ImageEdit: ImageVector? = null

@Preview
@Composable
private fun ImageEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ImageEdit, contentDescription = null)
    }
}
