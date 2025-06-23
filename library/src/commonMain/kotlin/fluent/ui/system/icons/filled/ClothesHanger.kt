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

public val FluentIcons.Filled.ClothesHanger: ImageVector
    get() {
        if (_ClothesHanger != null) {
            return _ClothesHanger!!
        }
        _ClothesHanger = ImageVector.Builder(
            name = "Filled.ClothesHanger",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(12f, 4.5f)
                curveTo(11.51f, 4.5f, 11.075f, 4.734f, 10.799f, 5.101f)
                curveTo(10.73f, 5.193f, 10.671f, 5.294f, 10.624f, 5.4f)
                curveTo(10.403f, 5.906f, 9.814f, 6.137f, 9.308f, 5.916f)
                curveTo(8.802f, 5.695f, 8.571f, 5.106f, 8.792f, 4.6f)
                curveTo(8.901f, 4.349f, 9.039f, 4.115f, 9.2f, 3.899f)
                curveTo(9.837f, 3.052f, 10.854f, 2.5f, 12f, 2.5f)
                curveTo(13.933f, 2.5f, 15.5f, 4.067f, 15.5f, 6f)
                curveTo(15.5f, 7.4f, 14.678f, 8.607f, 13.494f, 9.166f)
                curveTo(13.311f, 9.252f, 13.167f, 9.36f, 13.08f, 9.459f)
                curveTo(13f, 9.551f, 13f, 9.596f, 13f, 9.601f)
                curveTo(13f, 9.638f, 13.02f, 9.673f, 13.052f, 9.691f)
                lineTo(20.595f, 13.881f)
                curveTo(21.462f, 14.363f, 22f, 15.277f, 22f, 16.269f)
                curveTo(22f, 17.777f, 20.777f, 19f, 19.269f, 19f)
                horizontalLineTo(4.743f)
                curveTo(3.228f, 19f, 2f, 17.772f, 2f, 16.257f)
                curveTo(2f, 15.276f, 2.523f, 14.371f, 3.372f, 13.881f)
                lineTo(9f, 10.634f)
                curveTo(9.479f, 10.358f, 10.09f, 10.522f, 10.366f, 11f)
                curveTo(10.642f, 11.479f, 10.478f, 12.09f, 10f, 12.366f)
                lineTo(4.372f, 15.613f)
                curveTo(4.142f, 15.746f, 4f, 15.991f, 4f, 16.257f)
                curveTo(4f, 16.667f, 4.333f, 17f, 4.743f, 17f)
                horizontalLineTo(19.269f)
                curveTo(19.673f, 17f, 20f, 16.673f, 20f, 16.269f)
                curveTo(20f, 16.003f, 19.856f, 15.758f, 19.624f, 15.629f)
                lineTo(12.081f, 11.439f)
                curveTo(11.414f, 11.068f, 11f, 10.365f, 11f, 9.602f)
                curveTo(11f, 8.394f, 11.984f, 7.667f, 12.639f, 7.358f)
                curveTo(13.15f, 7.116f, 13.5f, 6.598f, 13.5f, 6f)
                curveTo(13.5f, 5.172f, 12.828f, 4.5f, 12f, 4.5f)
                close()
            }
        }.build()

        return _ClothesHanger!!
    }

@Suppress("ObjectPropertyName")
private var _ClothesHanger: ImageVector? = null

@Preview
@Composable
private fun ClothesHangerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.ClothesHanger, contentDescription = null)
    }
}
