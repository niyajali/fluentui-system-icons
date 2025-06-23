/*
 * MIT License
 *
 * Copyright (c) 2020 Microsoft Corporation
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE.
 */
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

public val FluentIcons.Filled.TagEdit: ImageVector
    get() {
        if (_TagEdit != null) {
            return _TagEdit!!
        }
        _TagEdit = ImageVector.Builder(
            name = "Filled.TagEdit",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(19.75f, 2f)
                curveTo(20.993f, 2f, 22f, 3.007f, 22f, 4.25f)
                verticalLineTo(9.712f)
                curveTo(22f, 10.074f, 21.94f, 10.429f, 21.825f, 10.765f)
                curveTo(20.534f, 9.683f, 18.607f, 9.749f, 17.394f, 10.962f)
                lineTo(11.491f, 16.865f)
                curveTo(11.019f, 17.337f, 10.684f, 17.929f, 10.522f, 18.577f)
                lineTo(10.064f, 20.407f)
                curveTo(9.973f, 20.774f, 9.983f, 21.132f, 10.071f, 21.459f)
                curveTo(9.3f, 21.417f, 8.541f, 21.102f, 7.951f, 20.514f)
                lineTo(3.489f, 16.059f)
                curveTo(2.219f, 14.791f, 2.217f, 12.733f, 3.485f, 11.463f)
                lineTo(11.985f, 2.953f)
                curveTo(12.595f, 2.343f, 13.422f, 2f, 14.285f, 2f)
                horizontalLineTo(19.75f)
                close()
                moveTo(17f, 5.502f)
                curveTo(16.171f, 5.502f, 15.5f, 6.174f, 15.5f, 7.002f)
                curveTo(15.5f, 7.831f, 16.171f, 8.502f, 17f, 8.502f)
                curveTo(17.828f, 8.502f, 18.5f, 7.831f, 18.5f, 7.002f)
                curveTo(18.5f, 6.174f, 17.828f, 5.502f, 17f, 5.502f)
                close()
                moveTo(18.1f, 11.67f)
                lineTo(12.197f, 17.572f)
                curveTo(11.853f, 17.916f, 11.609f, 18.347f, 11.491f, 18.819f)
                lineTo(11.033f, 20.65f)
                curveTo(10.834f, 21.446f, 11.556f, 22.167f, 12.352f, 21.968f)
                lineTo(14.182f, 21.511f)
                curveTo(14.655f, 21.393f, 15.086f, 21.149f, 15.43f, 20.804f)
                lineTo(21.332f, 14.902f)
                curveTo(22.225f, 14.009f, 22.225f, 12.562f, 21.332f, 11.67f)
                curveTo(20.44f, 10.777f, 18.993f, 10.777f, 18.1f, 11.67f)
                close()
            }
        }.build()

        return _TagEdit!!
    }

@Suppress("ObjectPropertyName")
private var _TagEdit: ImageVector? = null

@Preview
@Composable
private fun TagEditPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.TagEdit, contentDescription = null)
    }
}
