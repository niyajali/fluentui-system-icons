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
 * DocumentVb icon from Microsoft FluentUI System Icons.
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 16dp
 * - Keywords: document, vb
 * - Source: ic_fluent_document_vb_16_regular.svg
 * 
 * @return The [ImageVector] for the DocumentVb icon.
 */
public val FluentIcons.Regular.DocumentVb: ImageVector
    get() {
        if (_documentVb != null) {
            return _documentVb!!
        }
        _documentVb = Builder(name = "DocumentVb", defaultWidth = 16.0.dp, defaultHeight = 16.0.dp, viewportWidth = 16.0f, viewportHeight = 16.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.65f, 1.44f)
                lineTo(12.56f, 4.35f)
                curveTo(12.84f, 4.63f, 13.0f, 5.02f, 13.0f, 5.41f)
                verticalLineTo(13.0f)
                curveTo(13.0f, 14.1f, 12.1f, 15.0f, 11.0f, 15.0f)
                horizontalLineTo(8.75f)
                curveTo(8.89f, 14.81f, 9.01f, 14.6f, 9.09f, 14.37f)
                curveTo(9.135f, 14.262f, 9.164f, 14.146f, 9.191f, 14.036f)
                curveTo(9.194f, 14.024f, 9.197f, 14.012f, 9.2f, 14.0f)
                horizontalLineTo(11.0f)
                curveTo(11.55f, 14.0f, 12.0f, 13.55f, 12.0f, 13.0f)
                verticalLineTo(6.0f)
                horizontalLineTo(9.5f)
                curveTo(8.67f, 6.0f, 8.0f, 5.33f, 8.0f, 4.5f)
                verticalLineTo(2.0f)
                horizontalLineTo(5.0f)
                curveTo(4.45f, 2.0f, 4.0f, 2.45f, 4.0f, 3.0f)
                verticalLineTo(9.0f)
                curveTo(3.78f, 9.0f, 3.58f, 9.05f, 3.38f, 9.13f)
                curveTo(3.24f, 9.2f, 3.11f, 9.28f, 3.0f, 9.4f)
                verticalLineTo(3.0f)
                curveTo(3.0f, 1.9f, 3.9f, 1.0f, 5.0f, 1.0f)
                horizontalLineTo(8.59f)
                curveTo(8.98f, 1.0f, 9.37f, 1.16f, 9.65f, 1.44f)
                close()
                moveTo(9.0f, 4.5f)
                curveTo(9.0f, 4.78f, 9.22f, 5.0f, 9.5f, 5.0f)
                horizontalLineTo(11.79f)
                lineTo(9.0f, 2.21f)
                verticalLineTo(4.5f)
                close()
                moveTo(7.996f, 11.6f)
                curveTo(7.978f, 11.874f, 7.885f, 12.137f, 7.727f, 12.362f)
                lineTo(7.728f, 12.363f)
                curveTo(7.961f, 12.562f, 8.126f, 12.828f, 8.203f, 13.125f)
                curveTo(8.279f, 13.422f, 8.263f, 13.735f, 8.157f, 14.022f)
                curveTo(8.05f, 14.309f, 7.858f, 14.557f, 7.607f, 14.732f)
                curveTo(7.355f, 14.907f, 7.056f, 15.001f, 6.75f, 15.001f)
                horizontalLineTo(5.5f)
                curveTo(5.367f, 15.001f, 5.24f, 14.949f, 5.146f, 14.855f)
                curveTo(5.053f, 14.761f, 5.0f, 14.634f, 5.0f, 14.501f)
                verticalLineTo(10.501f)
                curveTo(5.0f, 10.368f, 5.052f, 10.241f, 5.146f, 10.147f)
                curveTo(5.24f, 10.054f, 5.367f, 10.001f, 5.5f, 10.001f)
                horizontalLineTo(6.5f)
                curveTo(6.774f, 10.001f, 7.043f, 10.076f, 7.278f, 10.219f)
                curveTo(7.512f, 10.361f, 7.703f, 10.565f, 7.83f, 10.809f)
                curveTo(7.957f, 11.052f, 8.014f, 11.326f, 7.996f, 11.6f)
                close()
                moveTo(6.5f, 11.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(12.0f)
                horizontalLineTo(6.5f)
                curveTo(6.633f, 12.0f, 6.76f, 11.948f, 6.854f, 11.854f)
                curveTo(6.947f, 11.76f, 7.0f, 11.633f, 7.0f, 11.5f)
                curveTo(7.0f, 11.367f, 6.948f, 11.24f, 6.854f, 11.146f)
                curveTo(6.76f, 11.053f, 6.633f, 11.0f, 6.5f, 11.0f)
                close()
                moveTo(6.0f, 14.0f)
                horizontalLineTo(6.75f)
                curveTo(6.883f, 14.0f, 7.01f, 13.948f, 7.104f, 13.854f)
                curveTo(7.197f, 13.76f, 7.25f, 13.633f, 7.25f, 13.5f)
                curveTo(7.25f, 13.367f, 7.198f, 13.24f, 7.104f, 13.146f)
                curveTo(7.01f, 13.053f, 6.883f, 13.0f, 6.75f, 13.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(14.0f)
                close()
                moveTo(2.968f, 14.676f)
                lineTo(4.468f, 10.676f)
                curveTo(4.514f, 10.552f, 4.509f, 10.415f, 4.454f, 10.294f)
                curveTo(4.4f, 10.173f, 4.299f, 10.079f, 4.175f, 10.032f)
                curveTo(4.051f, 9.986f, 3.914f, 9.99f, 3.793f, 10.045f)
                curveTo(3.672f, 10.099f, 3.578f, 10.2f, 3.531f, 10.324f)
                lineTo(2.499f, 13.076f)
                lineTo(1.467f, 10.324f)
                curveTo(1.42f, 10.2f, 1.326f, 10.1f, 1.205f, 10.045f)
                curveTo(1.085f, 9.99f, 0.947f, 9.985f, 0.823f, 10.032f)
                curveTo(0.699f, 10.079f, 0.599f, 10.173f, 0.544f, 10.294f)
                curveTo(0.517f, 10.354f, 0.502f, 10.418f, 0.5f, 10.484f)
                curveTo(0.498f, 10.549f, 0.509f, 10.615f, 0.532f, 10.676f)
                lineTo(2.032f, 14.676f)
                curveTo(2.067f, 14.771f, 2.131f, 14.853f, 2.215f, 14.911f)
                curveTo(2.299f, 14.969f, 2.398f, 15.0f, 2.5f, 15.0f)
                curveTo(2.602f, 15.0f, 2.701f, 14.969f, 2.785f, 14.911f)
                curveTo(2.868f, 14.853f, 2.932f, 14.771f, 2.968f, 14.676f)
                close()
            }
        }
        .build()
        return _documentVb!!
    }

@Suppress("ObjectPropertyName")
private var _documentVb: ImageVector? = null

@Preview
@Composable
private fun DocumentVbPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.DocumentVb, contentDescription = null)
    }
}

