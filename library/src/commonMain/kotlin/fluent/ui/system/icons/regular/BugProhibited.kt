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
 * BugProhibited Icon (20dp)
 * 
 * **Icon details:**
 * - Style: Regular
 * - Size: 20dp
 * - Keywords: fluent-icon
 * - Description: Used to represent bugs in code or malicious bugs in the system.
 *
 * - Source:  @see [link](https://github.com/microsoft/fluentui-system-icons/blob/main/assets/ic_fluent_bug_prohibited_20_regular.svg)
 * 
 * @return The [ImageVector] for the BugProhibited icon.
 */
public val FluentIcons.Regular.BugProhibited: ImageVector
    get() {
        if (_bugProhibited != null) {
            return _bugProhibited!!
        }
        _bugProhibited = Builder(name = "BugProhibited", defaultWidth = 20.0.dp, defaultHeight = 20.0.dp, viewportWidth = 20.0f, viewportHeight = 20.0f).apply {
            path(fill = SolidColor(Color(0xFF212121)), stroke = null, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(9.18f, 15.872f)
                curveTo(9.277f, 16.247f, 9.413f, 16.611f, 9.587f, 16.958f)
                curveTo(8.605f, 16.859f, 7.695f, 16.4f, 7.032f, 15.669f)
                curveTo(6.37f, 14.938f, 6.002f, 13.987f, 6.0f, 13.0f)
                horizontalLineTo(5.5f)
                curveTo(5.102f, 13.0f, 4.721f, 13.158f, 4.439f, 13.439f)
                curveTo(4.158f, 13.721f, 4.0f, 14.102f, 4.0f, 14.5f)
                verticalLineTo(16.5f)
                curveTo(4.0f, 16.633f, 3.947f, 16.76f, 3.854f, 16.854f)
                curveTo(3.76f, 16.947f, 3.633f, 17.0f, 3.5f, 17.0f)
                curveTo(3.367f, 17.0f, 3.24f, 16.947f, 3.146f, 16.854f)
                curveTo(3.053f, 16.76f, 3.0f, 16.633f, 3.0f, 16.5f)
                verticalLineTo(14.5f)
                curveTo(3.0f, 13.837f, 3.263f, 13.201f, 3.732f, 12.732f)
                curveTo(4.201f, 12.263f, 4.837f, 12.0f, 5.5f, 12.0f)
                horizontalLineTo(6.0f)
                verticalLineTo(10.5f)
                horizontalLineTo(2.5f)
                curveTo(2.367f, 10.5f, 2.24f, 10.447f, 2.146f, 10.354f)
                curveTo(2.053f, 10.26f, 2.0f, 10.133f, 2.0f, 10.0f)
                curveTo(2.0f, 9.867f, 2.053f, 9.74f, 2.146f, 9.646f)
                curveTo(2.24f, 9.553f, 2.367f, 9.5f, 2.5f, 9.5f)
                horizontalLineTo(6.0f)
                verticalLineTo(8.0f)
                horizontalLineTo(5.5f)
                curveTo(4.837f, 8.0f, 4.201f, 7.737f, 3.732f, 7.268f)
                curveTo(3.263f, 6.799f, 3.0f, 6.163f, 3.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(3.0f, 3.367f, 3.053f, 3.24f, 3.146f, 3.146f)
                curveTo(3.24f, 3.053f, 3.367f, 3.0f, 3.5f, 3.0f)
                curveTo(3.633f, 3.0f, 3.76f, 3.053f, 3.854f, 3.146f)
                curveTo(3.947f, 3.24f, 4.0f, 3.367f, 4.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(4.0f, 5.898f, 4.158f, 6.279f, 4.439f, 6.561f)
                curveTo(4.721f, 6.842f, 5.102f, 7.0f, 5.5f, 7.0f)
                horizontalLineTo(6.0f)
                curveTo(6.0f, 6.323f, 6.228f, 5.666f, 6.649f, 5.136f)
                curveTo(7.069f, 4.605f, 7.656f, 4.233f, 8.315f, 4.078f)
                curveTo(8.109f, 3.756f, 8.0f, 3.382f, 8.0f, 3.0f)
                verticalLineTo(2.5f)
                curveTo(8.0f, 2.367f, 8.053f, 2.24f, 8.146f, 2.146f)
                curveTo(8.24f, 2.053f, 8.367f, 2.0f, 8.5f, 2.0f)
                curveTo(8.633f, 2.0f, 8.76f, 2.053f, 8.854f, 2.146f)
                curveTo(8.947f, 2.24f, 9.0f, 2.367f, 9.0f, 2.5f)
                verticalLineTo(3.0f)
                curveTo(9.0f, 3.265f, 9.105f, 3.52f, 9.293f, 3.707f)
                curveTo(9.48f, 3.895f, 9.735f, 4.0f, 10.0f, 4.0f)
                curveTo(10.265f, 4.0f, 10.52f, 3.895f, 10.707f, 3.707f)
                curveTo(10.895f, 3.52f, 11.0f, 3.265f, 11.0f, 3.0f)
                verticalLineTo(2.5f)
                curveTo(11.0f, 2.367f, 11.053f, 2.24f, 11.146f, 2.146f)
                curveTo(11.24f, 2.053f, 11.367f, 2.0f, 11.5f, 2.0f)
                curveTo(11.633f, 2.0f, 11.76f, 2.053f, 11.854f, 2.146f)
                curveTo(11.947f, 2.24f, 12.0f, 2.367f, 12.0f, 2.5f)
                verticalLineTo(3.0f)
                curveTo(12.0f, 3.382f, 11.891f, 3.756f, 11.685f, 4.078f)
                curveTo(12.344f, 4.233f, 12.931f, 4.605f, 13.351f, 5.136f)
                curveTo(13.772f, 5.666f, 14.0f, 6.323f, 14.0f, 7.0f)
                horizontalLineTo(14.5f)
                curveTo(14.898f, 7.0f, 15.279f, 6.842f, 15.561f, 6.561f)
                curveTo(15.842f, 6.279f, 16.0f, 5.898f, 16.0f, 5.5f)
                verticalLineTo(3.5f)
                curveTo(16.0f, 3.367f, 16.053f, 3.24f, 16.146f, 3.146f)
                curveTo(16.24f, 3.053f, 16.367f, 3.0f, 16.5f, 3.0f)
                curveTo(16.633f, 3.0f, 16.76f, 3.053f, 16.854f, 3.146f)
                curveTo(16.947f, 3.24f, 17.0f, 3.367f, 17.0f, 3.5f)
                verticalLineTo(5.5f)
                curveTo(17.0f, 6.163f, 16.737f, 6.799f, 16.268f, 7.268f)
                curveTo(15.799f, 7.737f, 15.163f, 8.0f, 14.5f, 8.0f)
                horizontalLineTo(14.0f)
                verticalLineTo(9.025f)
                curveTo(13.662f, 9.057f, 13.327f, 9.12f, 13.0f, 9.213f)
                verticalLineTo(7.0f)
                curveTo(13.0f, 6.47f, 12.789f, 5.961f, 12.414f, 5.586f)
                curveTo(12.039f, 5.211f, 11.53f, 5.0f, 11.0f, 5.0f)
                horizontalLineTo(9.0f)
                curveTo(8.47f, 5.0f, 7.961f, 5.211f, 7.586f, 5.586f)
                curveTo(7.211f, 5.961f, 7.0f, 6.47f, 7.0f, 7.0f)
                verticalLineTo(13.0f)
                curveTo(7.001f, 13.651f, 7.215f, 14.283f, 7.608f, 14.802f)
                curveTo(8.002f, 15.32f, 8.554f, 15.696f, 9.18f, 15.872f)
                close()
                moveTo(19.0f, 14.5f)
                curveTo(19.0f, 15.693f, 18.526f, 16.838f, 17.682f, 17.682f)
                curveTo(16.838f, 18.526f, 15.693f, 19.0f, 14.5f, 19.0f)
                curveTo(13.307f, 19.0f, 12.162f, 18.526f, 11.318f, 17.682f)
                curveTo(10.474f, 16.838f, 10.0f, 15.693f, 10.0f, 14.5f)
                curveTo(10.0f, 13.307f, 10.474f, 12.162f, 11.318f, 11.318f)
                curveTo(12.162f, 10.474f, 13.307f, 10.0f, 14.5f, 10.0f)
                curveTo(15.693f, 10.0f, 16.838f, 10.474f, 17.682f, 11.318f)
                curveTo(18.526f, 12.162f, 19.0f, 13.307f, 19.0f, 14.5f)
                verticalLineTo(14.5f)
                close()
                moveTo(11.7f, 16.6f)
                lineTo(16.6f, 11.7f)
                curveTo(15.995f, 11.245f, 15.257f, 10.999f, 14.5f, 11.0f)
                curveTo(13.572f, 11.0f, 12.682f, 11.369f, 12.025f, 12.025f)
                curveTo(11.369f, 12.682f, 11.0f, 13.572f, 11.0f, 14.5f)
                curveTo(10.999f, 15.257f, 11.245f, 15.995f, 11.7f, 16.6f)
                verticalLineTo(16.6f)
                close()
                moveTo(18.0f, 14.5f)
                curveTo(18.001f, 13.743f, 17.756f, 13.005f, 17.3f, 12.4f)
                lineTo(12.4f, 17.3f)
                curveTo(13.005f, 17.756f, 13.743f, 18.001f, 14.5f, 18.0f)
                curveTo(15.428f, 18.0f, 16.319f, 17.631f, 16.975f, 16.975f)
                curveTo(17.631f, 16.319f, 18.0f, 15.428f, 18.0f, 14.5f)
                verticalLineTo(14.5f)
                close()
            }
        }
        .build()
        return _bugProhibited!!
    }

@Suppress("ObjectPropertyName")
private var _bugProhibited: ImageVector? = null

@Preview
@Composable
private fun BugProhibitedPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentIcons.Regular.BugProhibited, contentDescription = "BugProhibited Icon")
    }
}

