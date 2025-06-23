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

public val FluentIcons.Filled.Layer: ImageVector
    get() {
        if (_Layer != null) {
            return _Layer!!
        }
        _Layer = ImageVector.Builder(
            name = "Filled.Layer",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(13.387f, 3.425f)
                lineTo(19.752f, 7.668f)
                curveTo(20.212f, 7.975f, 20.336f, 8.595f, 20.029f, 9.055f)
                curveTo(19.956f, 9.165f, 19.862f, 9.259f, 19.752f, 9.332f)
                lineTo(13.387f, 13.576f)
                curveTo(12.547f, 14.136f, 11.453f, 14.136f, 10.613f, 13.576f)
                lineTo(4.248f, 9.332f)
                curveTo(3.789f, 9.026f, 3.664f, 8.405f, 3.971f, 7.946f)
                curveTo(4.044f, 7.836f, 4.138f, 7.741f, 4.248f, 7.668f)
                lineTo(10.613f, 3.425f)
                curveTo(11.453f, 2.865f, 12.547f, 2.865f, 13.387f, 3.425f)
                close()
                moveTo(20.026f, 12.192f)
                curveTo(19.877f, 12.43f, 19.681f, 12.633f, 19.449f, 12.79f)
                lineTo(13.399f, 16.874f)
                curveTo(12.554f, 17.444f, 11.446f, 17.444f, 10.601f, 16.874f)
                lineTo(4.551f, 12.79f)
                curveTo(3.79f, 12.276f, 3.495f, 11.331f, 3.772f, 10.5f)
                lineTo(10.613f, 15.06f)
                curveTo(11.401f, 15.585f, 12.411f, 15.618f, 13.226f, 15.158f)
                lineTo(13.387f, 15.06f)
                lineTo(20.227f, 10.5f)
                curveTo(20.409f, 11.046f, 20.354f, 11.666f, 20.026f, 12.192f)
                close()
                moveTo(20.026f, 15.442f)
                curveTo(19.877f, 15.68f, 19.681f, 15.883f, 19.449f, 16.04f)
                lineTo(13.399f, 20.124f)
                curveTo(12.554f, 20.694f, 11.446f, 20.694f, 10.601f, 20.124f)
                lineTo(4.551f, 16.04f)
                curveTo(3.79f, 15.526f, 3.495f, 14.581f, 3.772f, 13.75f)
                lineTo(10.613f, 18.31f)
                curveTo(11.401f, 18.835f, 12.411f, 18.868f, 13.226f, 18.408f)
                lineTo(13.387f, 18.31f)
                lineTo(20.227f, 13.75f)
                curveTo(20.409f, 14.296f, 20.354f, 14.916f, 20.026f, 15.442f)
                close()
            }
        }.build()

        return _Layer!!
    }

@Suppress("ObjectPropertyName")
private var _Layer: ImageVector? = null

@Preview
@Composable
private fun LayerPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Layer, contentDescription = null)
    }
}
