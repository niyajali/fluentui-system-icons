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
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentIcons
import org.jetbrains.compose.ui.tooling.preview.Preview

/**
 * Umbrella icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 24dp
 * - Keywords: umbrella
 * - Source: ic_fluent_umbrella_24_regular.svg
 * 
 * @return The [ImageVector] for the Umbrella icon.
 */
public val FluentIcons.Regular.Umbrella: ImageVector
    get() {
        if (_umbrella != null) {
            return _umbrella!!
        }
        _umbrella = Builder(name = "Umbrella", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp, viewportWidth = 24.0f, viewportHeight = 24.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.248f, 10.913f)
                curveTo(10.721f, 10.514f, 11.325f, 10.179f, 12.0f, 10.179f)
                curveTo(12.675f, 10.179f, 13.279f, 10.514f, 13.752f, 10.913f)
                curveTo(13.982f, 11.107f, 14.165f, 11.303f, 14.289f, 11.45f)
                curveTo(14.351f, 11.523f, 14.397f, 11.582f, 14.427f, 11.622f)
                lineTo(14.463f, 11.672f)
                curveTo(14.603f, 11.878f, 14.835f, 12.0f, 15.083f, 12.0f)
                curveTo(15.332f, 12.0f, 15.564f, 11.876f, 15.704f, 11.671f)
                curveTo(15.733f, 11.632f, 15.816f, 11.523f, 15.877f, 11.45f)
                curveTo(16.002f, 11.303f, 16.184f, 11.107f, 16.415f, 10.913f)
                curveTo(16.888f, 10.514f, 17.491f, 10.179f, 18.167f, 10.179f)
                curveTo(18.842f, 10.179f, 19.446f, 10.514f, 19.918f, 10.913f)
                curveTo(20.149f, 11.107f, 20.332f, 11.303f, 20.456f, 11.45f)
                lineTo(20.629f, 11.671f)
                curveTo(20.814f, 11.943f, 21.155f, 12.064f, 21.47f, 11.967f)
                curveTo(21.785f, 11.87f, 22.0f, 11.58f, 22.0f, 11.25f)
                curveTo(22.0f, 6.575f, 17.953f, 2.0f, 12.0f, 2.0f)
                curveTo(6.047f, 2.0f, 2.0f, 6.575f, 2.0f, 11.25f)
                curveTo(2.0f, 11.58f, 2.215f, 11.87f, 2.53f, 11.967f)
                curveTo(2.845f, 12.064f, 3.186f, 11.943f, 3.371f, 11.671f)
                lineTo(3.544f, 11.45f)
                curveTo(3.668f, 11.303f, 3.851f, 11.107f, 4.082f, 10.913f)
                curveTo(4.554f, 10.514f, 5.158f, 10.179f, 5.833f, 10.179f)
                curveTo(6.509f, 10.179f, 7.113f, 10.514f, 7.585f, 10.913f)
                curveTo(7.816f, 11.107f, 7.998f, 11.303f, 8.123f, 11.45f)
                curveTo(8.184f, 11.523f, 8.266f, 11.632f, 8.296f, 11.671f)
                curveTo(8.436f, 11.876f, 8.668f, 12.0f, 8.917f, 12.0f)
                curveTo(9.165f, 12.0f, 9.397f, 11.878f, 9.537f, 11.672f)
                lineTo(9.573f, 11.622f)
                curveTo(9.603f, 11.582f, 9.649f, 11.523f, 9.711f, 11.45f)
                curveTo(9.835f, 11.303f, 10.018f, 11.107f, 10.248f, 10.913f)
                close()
                moveTo(3.793f, 9.278f)
                curveTo(4.713f, 6.185f, 7.743f, 3.5f, 12.0f, 3.5f)
                curveTo(16.257f, 3.5f, 19.287f, 6.185f, 20.207f, 9.278f)
                curveTo(19.657f, 8.946f, 18.967f, 8.679f, 18.167f, 8.679f)
                curveTo(16.992f, 8.679f, 16.054f, 9.254f, 15.448f, 9.766f)
                curveTo(15.313f, 9.88f, 15.191f, 9.993f, 15.083f, 10.101f)
                curveTo(14.975f, 9.993f, 14.854f, 9.88f, 14.719f, 9.766f)
                curveTo(14.113f, 9.254f, 13.175f, 8.679f, 12.0f, 8.679f)
                curveTo(10.825f, 8.679f, 9.888f, 9.254f, 9.281f, 9.766f)
                curveTo(9.146f, 9.88f, 9.025f, 9.993f, 8.917f, 10.101f)
                curveTo(8.809f, 9.993f, 8.687f, 9.88f, 8.552f, 9.766f)
                curveTo(7.946f, 9.254f, 7.008f, 8.679f, 5.833f, 8.679f)
                curveTo(5.033f, 8.679f, 4.343f, 8.946f, 3.793f, 9.278f)
                close()
                moveTo(12.0f, 11.179f)
                curveTo(11.764f, 11.179f, 11.51f, 11.261f, 11.25f, 11.418f)
                verticalLineTo(19.0f)
                curveTo(11.25f, 19.829f, 10.578f, 20.5f, 9.75f, 20.5f)
                curveTo(8.922f, 20.5f, 8.25f, 19.829f, 8.25f, 19.0f)
                verticalLineTo(18.75f)
                curveTo(8.25f, 18.336f, 7.914f, 18.0f, 7.5f, 18.0f)
                curveTo(7.086f, 18.0f, 6.75f, 18.336f, 6.75f, 18.75f)
                verticalLineTo(19.0f)
                curveTo(6.75f, 20.657f, 8.093f, 22.0f, 9.75f, 22.0f)
                curveTo(11.407f, 22.0f, 12.75f, 20.657f, 12.75f, 19.0f)
                verticalLineTo(11.418f)
                curveTo(12.49f, 11.261f, 12.236f, 11.179f, 12.0f, 11.179f)
                close()
            }
        }
        .build()
        return _umbrella!!
    }

@Suppress("ObjectPropertyName")
private var _umbrella: ImageVector? = null

@Preview
@Composable
private fun UmbrellaPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.Umbrella, contentDescription = null)
    }
}

