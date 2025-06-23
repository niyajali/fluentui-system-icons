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

public val FluentIcons.Regular.DocumentCatchUp: ImageVector
    get() {
        if (_DocumentCatchUp != null) {
            return _DocumentCatchUp!!
        }
        _DocumentCatchUp = ImageVector.Builder(
            name = "Regular.DocumentCatchUp",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(18f, 20.5f)
                curveTo(18.276f, 20.5f, 18.5f, 20.275f, 18.5f, 20f)
                verticalLineTo(10f)
                horizontalLineTo(14f)
                curveTo(12.896f, 10f, 12f, 9.104f, 12f, 8f)
                verticalLineTo(3.5f)
                horizontalLineTo(6f)
                curveTo(5.724f, 3.5f, 5.5f, 3.725f, 5.5f, 4f)
                verticalLineTo(9.25f)
                curveTo(5.5f, 9.664f, 5.164f, 10f, 4.75f, 10f)
                curveTo(4.336f, 10f, 4f, 9.664f, 4f, 9.25f)
                verticalLineTo(4f)
                curveTo(4f, 2.896f, 4.896f, 2f, 6f, 2f)
                horizontalLineTo(12.172f)
                curveTo(12.2f, 2f, 12.227f, 2.004f, 12.254f, 2.007f)
                curveTo(12.274f, 2.01f, 12.293f, 2.013f, 12.313f, 2.014f)
                curveTo(12.528f, 2.029f, 12.74f, 2.07f, 12.937f, 2.152f)
                curveTo(12.994f, 2.176f, 13.049f, 2.208f, 13.103f, 2.239f)
                curveTo(13.12f, 2.249f, 13.136f, 2.259f, 13.153f, 2.268f)
                curveTo(13.168f, 2.276f, 13.184f, 2.284f, 13.2f, 2.292f)
                curveTo(13.228f, 2.305f, 13.256f, 2.319f, 13.281f, 2.336f)
                curveTo(13.359f, 2.389f, 13.429f, 2.452f, 13.5f, 2.516f)
                curveTo(13.512f, 2.526f, 13.524f, 2.536f, 13.536f, 2.545f)
                curveTo(13.553f, 2.558f, 13.57f, 2.571f, 13.585f, 2.586f)
                lineTo(19.414f, 8.414f)
                curveTo(19.789f, 8.789f, 20f, 9.298f, 20f, 9.828f)
                verticalLineTo(20f)
                curveTo(20f, 21.104f, 19.104f, 22f, 18f, 22f)
                horizontalLineTo(6f)
                curveTo(4.896f, 22f, 4f, 21.104f, 4f, 20f)
                verticalLineTo(16.25f)
                curveTo(4f, 15.836f, 4.336f, 15.5f, 4.75f, 15.5f)
                curveTo(5.164f, 15.5f, 5.5f, 15.836f, 5.5f, 16.25f)
                verticalLineTo(20f)
                curveTo(5.5f, 20.275f, 5.724f, 20.5f, 6f, 20.5f)
                horizontalLineTo(18f)
                close()
                moveTo(17.378f, 8.5f)
                lineTo(13.5f, 4.621f)
                verticalLineTo(8f)
                curveTo(13.5f, 8.275f, 13.724f, 8.5f, 14f, 8.5f)
                horizontalLineTo(17.378f)
                close()
                moveTo(2.75f, 13f)
                lineTo(5.255f, 13f)
                lineTo(6.812f, 9.449f)
                curveTo(7.06f, 8.882f, 7.835f, 8.853f, 8.139f, 9.358f)
                lineTo(8.145f, 9.368f)
                lineTo(8.195f, 9.471f)
                lineTo(10.608f, 15.498f)
                lineTo(12.035f, 13.398f)
                curveTo(12.146f, 13.188f, 12.349f, 13.045f, 12.58f, 13.009f)
                lineTo(12.591f, 13.007f)
                lineTo(12.697f, 13f)
                horizontalLineTo(14.697f)
                curveTo(15.111f, 13f, 15.447f, 13.336f, 15.447f, 13.75f)
                curveTo(15.447f, 14.125f, 15.171f, 14.437f, 14.81f, 14.491f)
                lineTo(14.8f, 14.493f)
                lineTo(14.697f, 14.5f)
                horizontalLineTo(13.143f)
                lineTo(11.164f, 17.594f)
                curveTo(10.889f, 18.12f, 10.15f, 18.124f, 9.858f, 17.634f)
                lineTo(9.853f, 17.625f)
                lineTo(9.804f, 17.524f)
                lineTo(7.467f, 11.689f)
                lineTo(6.432f, 14.051f)
                curveTo(6.336f, 14.271f, 6.141f, 14.428f, 5.914f, 14.481f)
                curveTo(5.898f, 14.484f, 5.883f, 14.487f, 5.868f, 14.49f)
                lineTo(5.856f, 14.492f)
                lineTo(5.745f, 14.5f)
                lineTo(2.75f, 14.5f)
                curveTo(2.336f, 14.5f, 2f, 14.164f, 2f, 13.75f)
                curveTo(2f, 13.374f, 2.276f, 13.063f, 2.637f, 13.009f)
                lineTo(2.647f, 13.007f)
                lineTo(2.75f, 13f)
                close()
            }
        }.build()

        return _DocumentCatchUp!!
    }

@Suppress("ObjectPropertyName")
private var _DocumentCatchUp: ImageVector? = null

@Preview
@Composable
private fun DocumentCatchUpPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentCatchUp, contentDescription = null)
    }
}
