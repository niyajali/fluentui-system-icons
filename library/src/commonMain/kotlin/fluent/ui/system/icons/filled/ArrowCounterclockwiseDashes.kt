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
import androidx.compose.ui.unit.dp
import fluent.ui.system.icons.FluentUi
import org.jetbrains.compose.ui.tooling.preview.Preview

public val FluentUi.Filled.ArrowCounterclockwiseDashes: ImageVector by
    lazy(LazyThreadSafetyMode.NONE) {
        ImageVector.Builder(
            name = "Filled.ArrowCounterclockwiseDashes",
            defaultWidth = 24.dp,
            defaultHeight = 24.dp,
            viewportWidth = 24f,
            viewportHeight = 24f,
        ).apply {
            path(fill = SolidColor(Color(0xFF212121))) {
                moveTo(5.004f, 4f)
                curveTo(5.004f, 3.448f, 5.451f, 3f, 6.004f, 3f)
                curveTo(6.556f, 3f, 7.004f, 3.448f, 7.004f, 4f)
                verticalLineTo(4.512f)
                curveTo(7.869f, 3.934f, 8.839f, 3.501f, 9.881f, 3.25f)
                curveTo(10.469f, 3.108f, 10.998f, 3.584f, 10.998f, 4.19f)
                curveTo(10.998f, 4.695f, 10.623f, 5.116f, 10.136f, 5.25f)
                curveTo(9.515f, 5.421f, 8.929f, 5.675f, 8.39f, 6f)
                horizontalLineTo(9.004f)
                curveTo(9.556f, 6f, 10.003f, 6.448f, 10.003f, 7f)
                curveTo(10.003f, 7.552f, 9.556f, 8f, 9.004f, 8f)
                horizontalLineTo(6.004f)
                curveTo(5.451f, 8f, 5.004f, 7.552f, 5.004f, 7f)
                verticalLineTo(4f)
                close()
                moveTo(14.115f, 3.25f)
                curveTo(13.526f, 3.108f, 12.998f, 3.584f, 12.998f, 4.19f)
                curveTo(12.998f, 4.695f, 13.373f, 5.116f, 13.86f, 5.25f)
                curveTo(14.423f, 5.405f, 14.957f, 5.629f, 15.453f, 5.911f)
                curveTo(15.893f, 6.161f, 16.455f, 6.128f, 16.812f, 5.77f)
                curveTo(17.24f, 5.342f, 17.203f, 4.632f, 16.686f, 4.316f)
                curveTo(15.9f, 3.836f, 15.035f, 3.472f, 14.115f, 3.25f)
                close()
                moveTo(4.187f, 12.998f)
                curveTo(4.693f, 12.998f, 5.114f, 13.373f, 5.248f, 13.861f)
                curveTo(5.403f, 14.424f, 5.626f, 14.959f, 5.909f, 15.455f)
                curveTo(6.159f, 15.895f, 6.126f, 16.457f, 5.768f, 16.814f)
                curveTo(5.34f, 17.243f, 4.63f, 17.205f, 4.314f, 16.688f)
                curveTo(3.833f, 15.902f, 3.47f, 15.036f, 3.248f, 14.115f)
                curveTo(3.106f, 13.527f, 3.582f, 12.998f, 4.187f, 12.998f)
                close()
                moveTo(10.136f, 18.75f)
                curveTo(10.623f, 18.884f, 10.998f, 19.305f, 10.998f, 19.81f)
                curveTo(10.998f, 20.416f, 10.469f, 20.891f, 9.881f, 20.75f)
                curveTo(8.96f, 20.528f, 8.094f, 20.164f, 7.308f, 19.683f)
                curveTo(6.792f, 19.367f, 6.754f, 18.657f, 7.182f, 18.229f)
                curveTo(7.54f, 17.871f, 8.102f, 17.838f, 8.541f, 18.088f)
                curveTo(9.038f, 18.371f, 9.573f, 18.594f, 10.136f, 18.75f)
                close()
                moveTo(15.455f, 18.088f)
                curveTo(15.894f, 17.838f, 16.457f, 17.871f, 16.814f, 18.228f)
                curveTo(17.242f, 18.656f, 17.205f, 19.367f, 16.688f, 19.683f)
                curveTo(15.902f, 20.164f, 15.036f, 20.528f, 14.115f, 20.75f)
                curveTo(13.526f, 20.891f, 12.998f, 20.416f, 12.998f, 19.81f)
                curveTo(12.998f, 19.305f, 13.373f, 18.884f, 13.86f, 18.75f)
                curveTo(14.423f, 18.594f, 14.958f, 18.371f, 15.455f, 18.088f)
                close()
                moveTo(18.748f, 13.861f)
                curveTo(18.882f, 13.373f, 19.303f, 12.998f, 19.809f, 12.998f)
                curveTo(20.414f, 12.998f, 20.89f, 13.527f, 20.748f, 14.115f)
                curveTo(20.526f, 15.036f, 20.163f, 15.901f, 19.682f, 16.688f)
                curveTo(19.366f, 17.204f, 18.656f, 17.242f, 18.228f, 16.814f)
                curveTo(17.87f, 16.456f, 17.837f, 15.894f, 18.087f, 15.455f)
                curveTo(18.37f, 14.958f, 18.593f, 14.424f, 18.748f, 13.861f)
                close()
                moveTo(18.086f, 8.543f)
                curveTo(17.836f, 8.104f, 17.869f, 7.542f, 18.227f, 7.184f)
                curveTo(18.655f, 6.756f, 19.365f, 6.794f, 19.681f, 7.31f)
                curveTo(20.162f, 8.096f, 20.525f, 8.961f, 20.747f, 9.881f)
                curveTo(20.889f, 10.47f, 20.413f, 10.998f, 19.808f, 10.998f)
                curveTo(19.302f, 10.998f, 18.881f, 10.624f, 18.747f, 10.137f)
                curveTo(18.592f, 9.574f, 18.369f, 9.04f, 18.086f, 8.543f)
                close()
            }
        }.build()
    }

@Preview
@Composable
private fun ArrowCounterclockwiseDashesPreview() {
    Box(modifier = Modifier.padding(12.dp)) {
        Image(imageVector = FluentUi.Filled.ArrowCounterclockwiseDashes, contentDescription = null)
    }
}
