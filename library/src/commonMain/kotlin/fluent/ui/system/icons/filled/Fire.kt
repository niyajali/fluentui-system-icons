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

public val FluentIcons.Filled.Fire: ImageVector
    get() {
        if (_Fire != null) {
            return _Fire!!
        }
        _Fire = ImageVector.Builder(
            name = "Filled.Fire",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(6.156f, 9.323f)
                lineTo(6.154f, 9.325f)
                lineTo(6.15f, 9.328f)
                lineTo(6.14f, 9.336f)
                curveTo(6.132f, 9.342f, 6.122f, 9.35f, 6.109f, 9.36f)
                curveTo(6.085f, 9.379f, 6.053f, 9.406f, 6.014f, 9.44f)
                curveTo(5.937f, 9.507f, 5.833f, 9.604f, 5.712f, 9.731f)
                curveTo(5.472f, 9.984f, 5.164f, 10.36f, 4.875f, 10.863f)
                curveTo(4.293f, 11.878f, 3.804f, 13.391f, 4.079f, 15.414f)
                curveTo(4.35f, 17.411f, 5.188f, 19.08f, 6.607f, 20.244f)
                curveTo(8.021f, 21.404f, 9.935f, 22f, 12.25f, 22f)
                curveTo(14.637f, 22f, 16.542f, 21.105f, 17.804f, 19.57f)
                curveTo(19.054f, 18.049f, 19.612f, 15.974f, 19.479f, 13.706f)
                curveTo(19.351f, 11.53f, 18.166f, 9.879f, 17.119f, 8.421f)
                curveTo(17.018f, 8.28f, 16.918f, 8.141f, 16.82f, 8.004f)
                curveTo(15.679f, 6.392f, 14.777f, 4.907f, 14.996f, 2.829f)
                curveTo(15.018f, 2.617f, 14.95f, 2.406f, 14.807f, 2.248f)
                curveTo(14.665f, 2.09f, 14.463f, 2f, 14.25f, 2f)
                curveTo(13.868f, 2f, 13.431f, 2.118f, 13.008f, 2.296f)
                curveTo(12.571f, 2.479f, 12.098f, 2.748f, 11.635f, 3.097f)
                curveTo(10.71f, 3.794f, 9.786f, 4.846f, 9.292f, 6.252f)
                curveTo(8.8f, 7.654f, 9.049f, 8.991f, 9.41f, 9.963f)
                curveTo(9.647f, 10.602f, 9.39f, 11.233f, 9.003f, 11.417f)
                curveTo(8.662f, 11.579f, 8.253f, 11.443f, 8.076f, 11.108f)
                lineTo(7.269f, 9.575f)
                curveTo(7.167f, 9.381f, 6.985f, 9.241f, 6.771f, 9.192f)
                curveTo(6.557f, 9.144f, 6.332f, 9.192f, 6.156f, 9.323f)
                close()
            }
        }.build()

        return _Fire!!
    }

@Suppress("ObjectPropertyName")
private var _Fire: ImageVector? = null

@Preview
@Composable
private fun FirePreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.Fire, contentDescription = null)
    }
}
