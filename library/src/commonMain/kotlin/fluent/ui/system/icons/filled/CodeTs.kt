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
 * CodeTs icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Filled
 * - Size: 16dp
 * - Keywords: code, ts
 * - Source: ic_fluent_code_ts_16_filled.svg
 * 
 * @return The [ImageVector] for the CodeTs icon.
 */
public val FluentIcons.Filled.CodeTs: ImageVector
    get() {
        if (_codeTs != null) {
            return _codeTs!!
        }
        _codeTs = Builder(name = "CodeTs", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.25f, 6.51f)
                curveTo(9.25f, 6.923f, 9.697f, 7.158f, 10.764f, 7.558f)
                curveTo(11.816f, 7.952f, 13.25f, 8.489f, 13.25f, 10.01f)
                verticalLineTo(10.012f)
                curveTo(13.247f, 10.367f, 13.172f, 10.709f, 13.026f, 11.03f)
                curveTo(12.881f, 11.353f, 12.673f, 11.637f, 12.412f, 11.872f)
                curveTo(12.151f, 12.107f, 11.848f, 12.283f, 11.511f, 12.394f)
                curveTo(11.181f, 12.503f, 10.824f, 12.544f, 10.476f, 12.509f)
                curveTo(10.408f, 12.517f, 10.335f, 12.521f, 10.262f, 12.521f)
                curveTo(10.014f, 12.521f, 9.744f, 12.478f, 9.49f, 12.394f)
                curveTo(9.153f, 12.283f, 8.851f, 12.107f, 8.589f, 11.871f)
                curveTo(8.328f, 11.636f, 8.121f, 11.353f, 7.975f, 11.03f)
                curveTo(7.829f, 10.708f, 7.754f, 10.366f, 7.751f, 10.012f)
                curveTo(7.751f, 9.81f, 7.829f, 9.622f, 7.971f, 9.48f)
                curveTo(8.255f, 9.197f, 8.749f, 9.197f, 9.032f, 9.48f)
                curveTo(9.174f, 9.621f, 9.252f, 9.81f, 9.252f, 10.01f)
                curveTo(9.252f, 10.962f, 10.293f, 11.01f, 10.502f, 11.01f)
                curveTo(10.711f, 11.01f, 11.752f, 10.962f, 11.752f, 10.01f)
                curveTo(11.752f, 9.597f, 11.305f, 9.362f, 10.238f, 8.962f)
                curveTo(9.186f, 8.568f, 7.752f, 8.031f, 7.752f, 6.51f)
                curveTo(7.755f, 6.153f, 7.83f, 5.811f, 7.976f, 5.49f)
                curveTo(8.12f, 5.169f, 8.327f, 4.885f, 8.59f, 4.649f)
                curveTo(8.852f, 4.412f, 9.156f, 4.236f, 9.491f, 4.127f)
                curveTo(9.82f, 4.018f, 10.175f, 3.979f, 10.526f, 4.011f)
                curveTo(10.823f, 3.978f, 11.183f, 4.019f, 11.513f, 4.127f)
                curveTo(11.847f, 4.236f, 12.15f, 4.412f, 12.413f, 4.649f)
                curveTo(12.675f, 4.886f, 12.882f, 5.169f, 13.027f, 5.49f)
                curveTo(13.173f, 5.812f, 13.248f, 6.154f, 13.251f, 6.508f)
                curveTo(13.251f, 6.71f, 13.173f, 6.898f, 13.031f, 7.04f)
                curveTo(12.747f, 7.323f, 12.253f, 7.323f, 11.97f, 7.04f)
                curveTo(11.828f, 6.899f, 11.75f, 6.71f, 11.75f, 6.51f)
                curveTo(11.75f, 5.558f, 10.709f, 5.51f, 10.5f, 5.51f)
                curveTo(10.291f, 5.51f, 9.25f, 5.558f, 9.25f, 6.51f)
                close()
                moveTo(2.25f, 4.01f)
                horizontalLineTo(6.75f)
                curveTo(6.95f, 4.01f, 7.138f, 4.089f, 7.28f, 4.23f)
                curveTo(7.422f, 4.371f, 7.5f, 4.56f, 7.5f, 4.76f)
                curveTo(7.5f, 4.96f, 7.421f, 5.148f, 7.28f, 5.29f)
                curveTo(7.139f, 5.432f, 6.95f, 5.51f, 6.75f, 5.51f)
                horizontalLineTo(5.25f)
                verticalLineTo(11.76f)
                curveTo(5.25f, 11.96f, 5.171f, 12.148f, 5.03f, 12.29f)
                curveTo(4.889f, 12.432f, 4.7f, 12.51f, 4.5f, 12.51f)
                curveTo(4.3f, 12.51f, 4.112f, 12.431f, 3.97f, 12.29f)
                curveTo(3.828f, 12.149f, 3.75f, 11.96f, 3.75f, 11.76f)
                verticalLineTo(5.51f)
                horizontalLineTo(2.25f)
                curveTo(2.05f, 5.51f, 1.862f, 5.431f, 1.72f, 5.29f)
                curveTo(1.578f, 5.149f, 1.5f, 4.96f, 1.5f, 4.76f)
                curveTo(1.5f, 4.56f, 1.579f, 4.372f, 1.72f, 4.23f)
                curveTo(1.861f, 4.088f, 2.05f, 4.01f, 2.25f, 4.01f)
                close()
            }
        }
        .build()
        return _codeTs!!
    }

@Suppress("ObjectPropertyName")
private var _codeTs: ImageVector? = null

@Preview
@Composable
private fun CodeTsPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Filled.CodeTs, contentDescription = null)
    }
}

