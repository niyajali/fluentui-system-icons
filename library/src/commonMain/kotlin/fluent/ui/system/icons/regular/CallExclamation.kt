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
 * CallExclamation Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon, teams
 * - Description: Used in call scenarios.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_call_exclamation_20_regular.svg)
 * 
 * @return The [ImageVector] for the CallExclamation icon.
 */
public val FluentIcons.Regular.CallExclamation: ImageVector
    get() {
        if (_callExclamation != null) {
            return _callExclamation!!
        }
        _callExclamation = Builder(name = "CallExclamation", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(10.0f, 2.0f)
                curveTo(13.332f, 1.996f, 15.586f, 3.276f, 17.154f, 4.66f)
                curveTo(17.814f, 5.242f, 18.116f, 6.118f, 17.959f, 6.94f)
                lineTo(17.802f, 7.769f)
                curveTo(17.653f, 8.546f, 16.927f, 9.068f, 16.104f, 8.988f)
                lineTo(14.467f, 8.83f)
                curveTo(13.753f, 8.761f, 13.224f, 8.24f, 13.0f, 7.5f)
                curveTo(12.696f, 6.495f, 12.5f, 5.75f, 12.5f, 5.75f)
                curveTo(11.752f, 5.444f, 11.014f, 5.25f, 10.0f, 5.25f)
                curveTo(8.986f, 5.25f, 8.262f, 5.465f, 7.5f, 5.75f)
                curveTo(7.5f, 5.75f, 7.296f, 6.496f, 7.0f, 7.5f)
                curveTo(6.802f, 8.171f, 6.496f, 8.757f, 5.797f, 8.827f)
                lineTo(4.169f, 8.991f)
                curveTo(3.357f, 9.072f, 2.578f, 8.555f, 2.347f, 7.782f)
                lineTo(2.099f, 6.953f)
                curveTo(1.853f, 6.127f, 2.073f, 5.259f, 2.676f, 4.672f)
                curveTo(4.101f, 3.288f, 6.673f, 2.004f, 10.0f, 2.0f)
                close()
                moveTo(13.475f, 5.527f)
                lineTo(13.501f, 5.622f)
                curveTo(13.523f, 5.705f, 13.557f, 5.827f, 13.599f, 5.98f)
                curveTo(13.685f, 6.286f, 13.807f, 6.716f, 13.957f, 7.21f)
                curveTo(14.094f, 7.661f, 14.346f, 7.814f, 14.563f, 7.835f)
                lineTo(16.2f, 7.993f)
                curveTo(16.546f, 8.026f, 16.775f, 7.816f, 16.819f, 7.582f)
                lineTo(16.977f, 6.753f)
                curveTo(17.065f, 6.289f, 16.896f, 5.766f, 16.492f, 5.409f)
                curveTo(15.067f, 4.152f, 13.04f, 2.996f, 10.001f, 3.0f)
                curveTo(6.926f, 3.004f, 4.606f, 4.192f, 3.373f, 5.39f)
                curveTo(3.045f, 5.709f, 2.914f, 6.188f, 3.057f, 6.667f)
                lineTo(3.305f, 7.496f)
                curveTo(3.396f, 7.802f, 3.726f, 8.03f, 4.069f, 7.996f)
                lineTo(5.697f, 7.832f)
                curveTo(5.736f, 7.828f, 5.749f, 7.82f, 5.751f, 7.819f)
                curveTo(5.755f, 7.816f, 5.773f, 7.806f, 5.802f, 7.769f)
                curveTo(5.871f, 7.681f, 5.954f, 7.513f, 6.041f, 7.218f)
                curveTo(6.187f, 6.72f, 6.311f, 6.286f, 6.398f, 5.977f)
                curveTo(6.442f, 5.822f, 6.476f, 5.699f, 6.5f, 5.615f)
                lineTo(6.527f, 5.518f)
                curveTo(6.629f, 5.151f, 6.985f, 4.896f, 7.15f, 4.813f)
                curveTo(7.969f, 4.507f, 8.819f, 4.25f, 10.0f, 4.25f)
                curveTo(11.165f, 4.25f, 12.033f, 4.478f, 12.879f, 4.825f)
                curveTo(13.031f, 4.887f, 13.362f, 5.109f, 13.467f, 5.496f)
                lineTo(13.469f, 5.503f)
                lineTo(13.475f, 5.527f)
                close()
                moveTo(14.5f, 13.5f)
                curveTo(14.5f, 15.985f, 12.485f, 18.0f, 10.0f, 18.0f)
                curveTo(7.515f, 18.0f, 5.5f, 15.985f, 5.5f, 13.5f)
                curveTo(5.5f, 11.015f, 7.515f, 9.0f, 10.0f, 9.0f)
                curveTo(12.485f, 9.0f, 14.5f, 11.015f, 14.5f, 13.5f)
                close()
                moveTo(10.0f, 11.0f)
                curveTo(9.724f, 11.0f, 9.5f, 11.224f, 9.5f, 11.5f)
                verticalLineTo(13.5f)
                curveTo(9.5f, 13.776f, 9.724f, 14.0f, 10.0f, 14.0f)
                curveTo(10.276f, 14.0f, 10.5f, 13.776f, 10.5f, 13.5f)
                verticalLineTo(11.5f)
                curveTo(10.5f, 11.224f, 10.276f, 11.0f, 10.0f, 11.0f)
                close()
                moveTo(10.0f, 16.125f)
                curveTo(10.345f, 16.125f, 10.625f, 15.845f, 10.625f, 15.5f)
                curveTo(10.625f, 15.155f, 10.345f, 14.875f, 10.0f, 14.875f)
                curveTo(9.655f, 14.875f, 9.375f, 15.155f, 9.375f, 15.5f)
                curveTo(9.375f, 15.845f, 9.655f, 16.125f, 10.0f, 16.125f)
                close()
            }
        }
        .build()
        return _callExclamation!!
    }

@Suppress("ObjectPropertyName")
private var _callExclamation: ImageVector? = null

@Preview
@Composable
private fun CallExclamationPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.CallExclamation, contentDescription = "CallExclamation Icon")
    }
}

