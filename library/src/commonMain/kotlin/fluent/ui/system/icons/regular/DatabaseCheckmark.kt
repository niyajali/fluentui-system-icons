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

public val FluentIcons.Regular.DatabaseCheckmark: ImageVector
    get() {
        if (_DatabaseCheckmark != null) {
            return _DatabaseCheckmark!!
        }
        _DatabaseCheckmark = ImageVector.Builder(
            name = "Regular.DatabaseCheckmark",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(4f, 6f)
                curveTo(4f, 5.309f, 4.315f, 4.707f, 4.774f, 4.22f)
                curveTo(5.229f, 3.738f, 5.853f, 3.337f, 6.567f, 3.018f)
                curveTo(7.996f, 2.377f, 9.917f, 2f, 12f, 2f)
                curveTo(14.083f, 2f, 16.004f, 2.377f, 17.433f, 3.018f)
                curveTo(18.147f, 3.337f, 18.771f, 3.738f, 19.226f, 4.22f)
                curveTo(19.685f, 4.707f, 20f, 5.309f, 20f, 6f)
                verticalLineTo(11.498f)
                curveTo(19.526f, 11.3f, 19.023f, 11.157f, 18.5f, 11.076f)
                verticalLineTo(8.392f)
                curveTo(18.179f, 8.613f, 17.819f, 8.809f, 17.433f, 8.982f)
                curveTo(16.004f, 9.623f, 14.083f, 10f, 12f, 10f)
                curveTo(9.917f, 10f, 7.996f, 9.623f, 6.567f, 8.982f)
                curveTo(6.181f, 8.809f, 5.821f, 8.613f, 5.5f, 8.392f)
                verticalLineTo(18f)
                curveTo(5.5f, 18.207f, 5.59f, 18.459f, 5.865f, 18.75f)
                curveTo(6.144f, 19.046f, 6.582f, 19.346f, 7.18f, 19.614f)
                curveTo(8.319f, 20.124f, 9.92f, 20.467f, 11.731f, 20.498f)
                curveTo(12.014f, 21.042f, 12.373f, 21.541f, 12.792f, 21.982f)
                curveTo(12.531f, 21.994f, 12.267f, 22f, 12f, 22f)
                curveTo(9.917f, 22f, 7.996f, 21.623f, 6.567f, 20.983f)
                curveTo(5.853f, 20.663f, 5.229f, 20.262f, 4.774f, 19.78f)
                curveTo(4.315f, 19.293f, 4f, 18.691f, 4f, 18f)
                verticalLineTo(6f)
                close()
                moveTo(5.5f, 6f)
                curveTo(5.5f, 6.207f, 5.59f, 6.459f, 5.865f, 6.75f)
                curveTo(6.144f, 7.046f, 6.582f, 7.345f, 7.18f, 7.614f)
                curveTo(8.375f, 8.149f, 10.079f, 8.5f, 12f, 8.5f)
                curveTo(13.921f, 8.5f, 15.625f, 8.149f, 16.82f, 7.614f)
                curveTo(17.418f, 7.345f, 17.856f, 7.046f, 18.135f, 6.75f)
                curveTo(18.41f, 6.459f, 18.5f, 6.207f, 18.5f, 6f)
                curveTo(18.5f, 5.793f, 18.41f, 5.541f, 18.135f, 5.25f)
                curveTo(17.856f, 4.954f, 17.418f, 4.654f, 16.82f, 4.386f)
                curveTo(15.625f, 3.851f, 13.921f, 3.5f, 12f, 3.5f)
                curveTo(10.079f, 3.5f, 8.375f, 3.851f, 7.18f, 4.386f)
                curveTo(6.582f, 4.654f, 6.144f, 4.954f, 5.865f, 5.25f)
                curveTo(5.59f, 5.541f, 5.5f, 5.793f, 5.5f, 6f)
                close()
                moveTo(23f, 17.5f)
                curveTo(23f, 20.538f, 20.538f, 23f, 17.5f, 23f)
                curveTo(14.462f, 23f, 12f, 20.538f, 12f, 17.5f)
                curveTo(12f, 14.462f, 14.462f, 12f, 17.5f, 12f)
                curveTo(20.538f, 12f, 23f, 14.462f, 23f, 17.5f)
                close()
                moveTo(20.854f, 15.146f)
                curveTo(20.658f, 14.951f, 20.342f, 14.951f, 20.146f, 15.146f)
                lineTo(16.5f, 18.793f)
                lineTo(14.854f, 17.146f)
                curveTo(14.658f, 16.951f, 14.342f, 16.951f, 14.146f, 17.146f)
                curveTo(13.951f, 17.342f, 13.951f, 17.658f, 14.146f, 17.854f)
                lineTo(16.146f, 19.854f)
                curveTo(16.342f, 20.049f, 16.658f, 20.049f, 16.854f, 19.854f)
                lineTo(20.854f, 15.854f)
                curveTo(21.049f, 15.658f, 21.049f, 15.342f, 20.854f, 15.146f)
                close()
            }
        }.build()

        return _DatabaseCheckmark!!
    }

@Suppress("ObjectPropertyName")
private var _DatabaseCheckmark: ImageVector? = null

@Preview
@Composable
private fun DatabaseCheckmarkPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DatabaseCheckmark, contentDescription = null)
    }
}
